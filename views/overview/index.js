import React, { Component } from 'react';
import { AppRegistry, TextInput, View, ListView, Text,StyleSheet,Button,Alert,TouchableHighlight,Image} from 'react-native';
import tokenHelper from '../../helper/token';
import cache from '../../helper/cache';
import config  from '../../helper/config';


class RowData{

  constructor(firstname,name,create,sended,doc){
    this.name = name;
    this.create = create;
    this.sended = sended;
    this.firstname = firstname;
    this.icon = firstname[0]+name[0];
    this.doc = doc;
  }

  setState = function (docid,senddate) {
    this.sended = senddate;
    this.doc = docid;
  }
}

export default class OverviewListView extends Component {
  constructor(props) { 
    super(props);
    this.state = { text: 'Useless Placeholder' };
    const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2}); 
 
    this.state = {
      dataSource: ds.cloneWithRows([]),
      baseUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/instantmessage/",
      token: `Bearer ${tokenHelper.token}`,
      messages: []
    };

    this._formatDate = function(date) {
      const d = date.split(".")
      const day = d[0] < 10 ? `0${d[0]}` : d[0]  
      const month = d[1] < 10 ? `0${d[1]}` : d[1]  
      const year = d[2] < 10 ? `0${d[2]}` : d[2]  
      return `${year}-${month}-${day}`
    }

    this._getSofortmeldungen = async function() {
      const prepMessages = []
      let resWorkers = []

      try {        
        const req = new Request(`${this.state.baseUrl}?organization=${config.orgaId}`);

        req.headers = {
          Accept: 'application/json', 
          'Authorization': this.state.token
        }  

        let response = await fetch(req); 
        let responseJson = await response.json();

        if (response.status == 200) { 
          resWorkers = responseJson.data
          resWorkers.map(x=>prepMessages.push(new RowData(x.vorname,x.nachname,x.eintrittsdatum,x.sendedatum,x.fileName)));          

        } else {
          Alert.alert("Oo smth. went wrong, response code " + response.status);
        }
      } catch (e) {
     
      
      } 
      finally {
        if (cache.length) {
          resWorkers.map(worker => {
            cache.deleteItem({
              vorname: worker.vorname,
              nachname: worker.nachname,
              svnummer: worker.svnummer,
              betriebstaettenummer: worker.betriebstaettenummer,
              eintrittsdatum: this._formatDate(worker.eintrittsdatum)
            })
          })
          const workers = cache.getItems();
          workers.map(worker => {
            prepMessages.push(new RowData(worker.vorname,worker.nachname,worker.eintrittsdatum,"pending", ""))            
          })                
        }
        //this.messages = prepMessages        
        this.setState({
          dataSource: this.state.dataSource.cloneWithRows(prepMessages)
        })
        this.setState({
          messages: prepMessages
        })
        this.forceUpdate()
      }
      
      this._getSofortmeldungen();
      if (!this.state.pollIntervall) {
        this.state.pollIntervall = setInterval( () => {
          this._getSofortmeldungen();
        }, 5000)
      }  
    }    
  }

  /* componentDidMount() {
    this._getSofortmeldungen();
    if (!this.state.pollIntervall) {
      this.state.pollIntervall = setInterval( () => {
        this._getSofortmeldungen();
      }, 5000)
    }    
  } */

  componentWillUnmount() {
    clearInterval(this.state.pollIntervall)
  }

  render() {
    return (
      <ListView
        style={styles.container}
        dataSource={this.state.dataSource}
        renderRow={
          (d) => <View style={styles.itemcontainer}>
            <Text style={[d.sended == "pending"?styles.pending:d.sended == "error"?styles.errors:styles.icon]}>{d.icon}</Text>
            <View style={styles.item}>
              <Text style={styles.bold}>{d.firstname} {d.name}</Text> 
              <Text style={styles.pdfsub}>Entry date: {d.create}</Text>
              <Text style={styles.pdfsub}>Send state: {d.sended}</Text>
              {d.doc ? 
                <TouchableHighlight style={{flex:1}} onPress={function () {config.doc=d.doc;this.props.navigation.navigate('PDF')}.bind(this)}>
                  <View style={styles.pdfcontainer}>
                    <Image
                      source={require('../../assets/images/pdf.png')}
                      resizeMode="contain"
                      fadeDuration={0}
                      style={{ width: 24, height: 24,flex:0.5}}   
                    />
                    <Text style={styles.pdftext}>message-{d.firstname} {d.name}</Text>    
                  </View>    
                </TouchableHighlight>
              : null
              }
            </View> 
          </View>
        }
      />
    );
  }


  /* renderItem=function(d){
    return d.doc?
    <TouchableHighlight style={{flex:1}} onPress={function () {config.doc=d.doc;this.props.navigation.navigate('PDF')}.bind(this)}>
    <View style={styles.pdfcontainer}>
    <Image
                    source={require('../../assets/images/pdf.png')}
                    resizeMode="contain"
                    fadeDuration={0}
                    style={{ width: 24, height: 24,flex:0.5}}   
                  />
      <Text style={styles.pdftext}>message-{d.firstname} {d.name}</Text>
    
    </View>
    
      </TouchableHighlight>:<Text />;
  }

  renderAll=function(messages){
return messages.length>0?<ListView 
        dataSource={this.state.dataSource} 
        renderRow={(d) => <View style={styles.itemcontainer}
        >

<Text style={[d.sended == "pending"?styles.pending:d.sended == "error"?styles.errors:styles.icon]}>{d.icon}</Text>
<View style={styles.item}>
<Text style={styles.bold}>{d.firstname} {d.name}</Text> 
<Text style={styles.pdfsub}>Entry date: {d.create}</Text>
<Text style={styles.pdfsub}>Send state: {d.sended}</Text>
  {this.renderItem(d)} 

</View> 




        </View>} 
 

      >
</ListView>:<Text />;
  }

  render() {
    return (
      <View style={{flex: 1}}>        
        <View  style={styles.send}>  
          <Button
            onPress={function () {this.props.navigation.navigate('SelectMode')}.bind(this)}  
            title="New immediate notice"
            accessibilityLabel="Learn more about this purple button"/>
        </View>
        {this.state.messages && this.state.messages.length ? 
          this.renderAll(this.state.messages)
        : null
        }
        {!this.state.messages || !this.state.messages.length ? 
          <Text style={styles.bold}>No Messages or still fetching...</Text>
        : null
        }
        // {this.renderAll(this.state.messages)}
      </View>
    );
  }  */



}



// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => OverviewListView);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },
  itemcontainer:{
    flex:1,
    flexDirection:"row",
    height:110,
    margin:1,
    backgroundColor:"#fff",
  },
  item:{
    flex:1,
    padding:4,
  },
  bold:{ 
    fontWeight: 'bold',
    fontSize:18, 
    paddingLeft:10,
  },
  icon:{
    backgroundColor:"#81C784",
    borderRadius:100,
    borderWidth: 1,
    borderColor: '#ddd', 
    width:50, 
    height:50,
    padding:10,
    textAlign:"center",
    justifyContent:"center", 
    marginTop:8,
 
  },
  errors:{
    backgroundColor:"#E57373",
    borderRadius:100,
    borderWidth: 1,
    borderColor: '#ddd',
    width:50, 
    height:50,
    padding:10,
    textAlign:"center",
    justifyContent:"center",
    marginTop:8,
    color:"#000",

    
  },
  pending:{
    backgroundColor:"#FFD54F",
    borderRadius:100,
    borderWidth: 1,
    borderColor: '#ddd',
    width:50, 
    height:50,
    padding:10,
    textAlign:"center", 
    justifyContent:"center",
    marginTop:8,

    
  },
  pdf:{
      width:20,
  },
  pdftext:{
    fontWeight:"bold", 
    color:"#ccc",
    flex:4,
    fontSize:13,
    
  },
  pdfcontainer:{
flexWrap: "nowrap",
flexDirection:'row',
paddingTop:10,
paddingLeft:20,
justifyContent:"flex-start",
alignItems:'flex-start',

  }, 
 pdfsub:{
   color:"#ccc",
   fontSize:13,
   paddingLeft:20,
 },
  send:{
padding:10, 
 
  }

});
