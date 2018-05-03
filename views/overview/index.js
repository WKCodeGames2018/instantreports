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
    this.messages = [];
 
    this.state = {
      dataSource: ds.cloneWithRows(this.messages),
      baseUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/instantmessage/",
      token: `Bearer ${tokenHelper.token}`
        
     
    };



    this._getSofortmeldungen = async function() { 
      try {
        const req = new Request(`${this.state.baseUrl}?organization=${config.orgaId}`);

        req.headers = {
          Accept: 'application/json', 
          'Authorization': this.state.token
        }  

        let response = await fetch(req); 
        let responseJson = await response.json();

        if (response.status == 200) { 

          responseJson.data.map(x=>this.messages.push(new RowData(x.vorname,x.nachname,x.eintrittsdatum,x.sendedatum,x.fileName)));          

        } else {
          Alert.alert("Oo smth. went wrong, response code " + response.status);
        }
      } catch (e) {
        Alert.alert(e.message);
      
      }
      finally {
        if (cache.length) {
          const worker = cache.getItem("instantreport");
          this.messages.push(new RowData(worker.vorname,worker.nachname,worker.eintrittsdatum,"pending", ""))
        }
      }
      this.setState({
        dataSource: this.state.dataSource.cloneWithRows(this.messages)
      })
    
    }

    this._getSofortmeldungen();
  }



  renderItem=function(d){
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
<Text>Entry date: {d.create}</Text>
<Text>Send state: {d.sended}</Text>
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

  accessibilityLabel="Learn more about this purple button"
/></View>
 
{this.renderAll(this.messages)}


    </View>
    );
  } 



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
    fontWeight: 'bold'
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
    color:"#000"
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
    
  },
  pdfcontainer:{
flexWrap: "nowrap",
flexDirection:'row',
paddingTop:10,
justifyContent:"flex-start",
alignItems:'flex-start'
  }, 
  send:{
padding:10, 

  }

});
