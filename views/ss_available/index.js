import React, { Component } from 'react';
import { AppRegistry, View, Button, TextInput, Picker, Input, Alert } from 'react-native';
import DatePicker from 'react-native-datepicker'
import config  from '../../helper/config';
import tokenHelper from '../../helper/token';

export default class SocialSecurity extends Component {
  constructor(props) {
    super(props);
    this.state = {
      surName: "surname",
      firstName: "firstname",
      entranceDate: "2018-05-01",
      socialSecurityNo: config.socialSecurityNo,
      selectedLocation: "",
      baseUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/firmendatenapicontract",
      registerUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/instantmessage",
      locations: [],
      token: `Bearer ${tokenHelper.token}`
    }

    this._register = async function () {
      try {
        const req = new Request(`${this.state.registerUrl}?organization=${config.orgaId}`);

        req.method = 'POST';
        req.headers = {
          Accept: 'application/json',
          'Authorization': this.state.token
        }
        req.body = JSON.stringify({
          vorname: this.state.firstName,
          nachname: this.state.surName,
          svnummer: this.state.socialSecurityNo,
          betriebstaettenummer: this.state.selectedLocation,
          eintrittsdatum: this.state.entranceDate
        })
        let response = await fetch(req);
        let responseJson = await response.json();

        if (response.status == 200) {
          this.props.navigation.navigate('List');
        } else {
          Alert.alert("Oo smth. went wrong, pls check your inputs");
        }
        
      } catch (error) {
        Alert.alert("Could not fetch locations");
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
      <View>
        <TextInput
          onChangeText={(surName) => this.setState({surName})}
          value={this.state.surName}
        />
        <TextInput
          onChangeText={(firstName) => this.setState({orfirstNamegfirstNamea})}
          value={this.state.firstName}
        />
        <TextInput
          onChangeText={(socialSecurityNo) => this.setState({socialSecurityNo})}
          value={this.state.socialSecurityNo}
        />
        {this.state.locations && this.state.locations.length > 0 ? 
          <Picker
            selectedValue={this.state.selectedLocation}
            style={{ height: 50, width: 100 }}
            onValueChange={(item, itemIndex) => this.setState({selectedLocation: item})}>
            {this.state.locations.map((item, key) => {
              return (
                <Picker.Item label={item.name} key={key} value={item.betriebsnummer} />
              );
            })}
          </Picker>
          : null} 
          <DatePicker
            style={{width: 200}}
            date={this.state.entranceDate}
            mode="date"
            placeholder="select date"
            format="YYYY-MM-DD"
            minDate="2018-05-01"
            maxDate="2018-07-01"
            confirmBtnText="Confirm"
            cancelBtnText="Cancel"
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
        <Button
          onPress={this._register.bind(this)}
          title="Send Data"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />     
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => SocialSecurity);