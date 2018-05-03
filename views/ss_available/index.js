import React, { Component } from 'react';
import { AppRegistry, View, Button, TextInput, Picker, Input, Alert,StyleSheet } from 'react-native';
import DatePicker from 'react-native-datepicker'
import config  from '../../helper/config';
import tokenHelper from '../../helper/token';
import cache from '../../helper/cache';

export default class SocialSecurity extends Component {
  constructor(props) {
    super(props);
    this.state = {
      surName: "surname",
      firstName: "firstname",
      entranceDate: "2018-05-03",
      socialSecurityNo: config.socialSecurityNo,
      selectedLocation: "",
      baseUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/firmendatenapicontract",
      registerUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/instantmessage",
      locations: [],
      token: `Bearer ${tokenHelper.token}`
    }

    if(config.scanfield1!=""){
      for (wert of config.scanfield1.split("\n")){

        if(wert.indexOf("X-VSNR:")==0){
          config.socialSecurityNo = wert.substring(7,wert.length-1);
          this.state.socialSecurityNo = config.socialSecurityNo;
      
        }
        if(wert.indexOf("FN:")==0){
     
          config.surName = wert.substring(3,wert.length-1);
          this.state.surName = config.surName.split(" ")[1];
          this.state.firstName = config.surName.split(" ")[0];

        }
      } 
  }else {
      this.state.socialSecurityNo ="";
      this.state.surName = "";
      this.state.firstName = "";
      
  }

    this._register = async function () {
      try {        
        let response = await fetch(`${this.state.registerUrl}?organization=${config.orgaId}`, {
          method: 'POST',
          headers: {
            Accept: 'application/json',
            'Authorization': this.state.token,
            'Content-Type': 'application/json',
          },
          body: JSON.stringify({
            vorname: this.state.firstName,
            nachname: this.state.surName,
            svnummer: this.state.socialSecurityNo,
            betriebstaettenummer: this.state.selectedLocation.betriebsnummer,
            eintrittsdatum: this.state.entranceDate
          })
        })
        let responseJson = await response.json();

        if (response.status == 201) {          
          cache.addItem({
            vorname: this.state.firstName,
            nachname: this.state.surName,
            svnummer: this.state.socialSecurityNo,
            betriebstaettenummer: this.state.selectedLocation.betriebsnummer,
            eintrittsdatum: this.state.entranceDate
          })
          this.props.navigation.navigate('List');
        } else {
          Alert.alert("Oo smth. went wrong, pls check your inputs");
        }
        
      } catch (error) {
        Alert.alert("Could not post dude");
      }
    }

    this._getLocations = async function() {
      try {
        const req = new Request(`${this.state.baseUrl}?organization=${config.orgaId}`);

        req.headers = {
          Accept: 'application/json',
          'Authorization': this.state.token
        }
        let response = await fetch(req);
        let responseJson = await response.json();

        if (response.status == 200) {
          this.setState({locations: responseJson.data[0].betriebsstaetten})
          this.setState({selectedLocation: this.state.locations[0]})
        } else {
          Alert.alert("Oo smth. went wrong, response code " + response.status);
        }
      } catch (e) {
        Alert.alert("Could not fetch locations");
      }
    }

    this._getLocations();
  }

  render() {
    return (
      <View style={styles.container}>
        <View>
       
       <DatePicker 
          style={styles.picker}
         date={this.state.entranceDate}
         mode="date"
         placeholder="select date"
         format="YYYY-MM-DD"
         minDate="2018-05-03"
         maxDate="2018-07-01"
         confirmBtnText="Confirm"  
         cancelBtnText="Cancel"
         showIcon={true}
         customStyles={{
           dateIcon: {
             position: 'absolute',
             left: 0,
             top: 4,
             marginLeft: 0
           },
           dateInput: {
             marginLeft: 36
           }
           // ... You can check the source to find the other keys.
         }}
         onDateChange={(date) => {this.setState({entranceDate: date})}}
       />

     
       </View>
       {this.state.locations && this.state.locations.length > 0 ? 
        <View style={{height: 50}}>
          <Picker
            selectedValue={this.state.selectedLocation}
            style={{flex: 1}}
            onValueChange={(item, itemIndex) => this.setState({selectedLocation: item})}>
            {this.state.locations.map((item, key) => {
              return (
                <Picker.Item label={item.name} key={key} value={item.betriebsnummer} />
              );
            })}
          </Picker>
        </View>
        : null} 
        <TextInput style={styles.field}
          onChangeText={(socialSecurityNo) => this.setState({socialSecurityNo})}
          value={this.state.socialSecurityNo}
        />
        <TextInput style={styles.field}
          onChangeText={(surName) => this.setState({surName})}
          placeholder="surname" 
          value={this.state.surName}
          
        />
        <TextInput style={styles.field}
          onChangeText={(firstName) => this.setState({firstName})}
          placeholder="firstname"
          value={this.state.firstName}
          
        />
      
          <View style={styles.send}>
        <Button
          onPress={this._register.bind(this)}
          title="Send Data"
          accessibilityLabel="Learn more about this purple button"
        />     
        </View>
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => SocialSecurity);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#eee',

  }, 
  backgroundImage: {
    flex: 1,
    width: null,
    height: null,
    padding:20,
    paddingTop:70,  
  },
  field:{
   
    padding:4,
    margin:10,
    backgroundColor:'#fff', 
    borderRadius: 4, 
    borderWidth: 0.5,
    borderColor: '#d6d7da',
    fontSize:18,
  },
  picker:{

    height:50,
    padding:4,
    margin:10,
    backgroundColor:'#fff', 
    borderRadius: 4, 
    borderWidth: 0.5,
    borderColor: '#d6d7da',

  },
  send:{
padding:10,

  }
});