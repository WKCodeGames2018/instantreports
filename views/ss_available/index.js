import React, { Component } from 'react';
import { AppRegistry, View, Button, TextInput, Picker, Input, Alert } from 'react-native';
import config  from '../../helper/config';
import tokenHelper from '../../helper/token';

export default class SocialSecurity extends Component {
  constructor(props) {
    super(props);
    this.state = {
      surName: "surname",
      firstName: "firstname",
      entranceDate: 1525273779950,
      socialSecurityNo: "ss_no",
      selectedLocation: "",
      baseUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/firmendatenapicontract",
      locations: [],
      token: `Bearer ${tokenHelper.token}`
    }

    this._register = function () {
      Alert.alert("Yolo")
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