import React, { Component } from 'react';
import { AppRegistry, TextInput, View, ListView, Text,StyleSheet,Button,Icon,Alert} from 'react-native';
import tokenHelper from '../../helper/token';
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
      this.setState({
        dataSource: this.state.dataSource.cloneWithRows(this.messages)
      })
    
    }

    this._getSofortmeldungen();
  }

  

  render() {
    return (
      <View style={{flex: 0.8}}>
        
        <View> 
      <Button style={{flex:1}}
  onPress={function () {this.props.navigation.navigate('SelectMode')}.bind(this)}  
  title="New immediate notice"
  color="#841584"
  accessibilityLabel="Learn more about this purple button"
/></View>

<ListView
        dataSource={this.state.dataSource} 
        renderRow={(d) => <View style={styles.itemcontainer}
        >

<Text style={[d.sended == "pending"?styles.pending:d.sended == "error"?styles.errors:styles.icon]}>{d.icon}</Text>
<View style={styles.item}>
<Text style={styles.bold}>{d.firstname} {d.name}</Text>
<Text>Created: {d.create}</Text>
<Text>Sended: {d.sended}</Text>
<Button style={{flex:1}}
  onPress={function () {config.doc=d.doc;this.props.navigation.navigate('PDF')}.bind(this)}  
  title="PDF"
  color="#841584"
  accessibilityLabel="Learn more about this purple button"
/>
</View>


        </View>} 
 

      >
</ListView>


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
    height:100,
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
    marginTop:30,
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
    marginTop:10,
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
    marginTop:10,
  },
  pdf:{
      width:20,
  },


});
