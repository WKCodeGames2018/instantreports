import React, { Component } from 'react';
import { AppRegistry, View, Button, TextInput, Picker, Input, Alert } from 'react-native';
import config  from '../../helper/config';
import tokenHelper from '../../helper/token'

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
      locations: [
        {
          "name": "Restaurant Wok n Roll",
          "betriebsnummer": "99999998",
        }
      ],
      token: `Bearer ${tokenHelper.token}`
    }

    this._register = function () {
      Alert.alert("Yolo")
    }

    this._getLocations = async function() {
      try {
        let response = await fetch(this.state.baseUrl, {
          method: 'POST',
          headers: {
            Accept: 'application/json',
            'Authorization': token
          },
          body: `organization=${config.orgaId}`
        });
        Alert.alert(token);
        let responseJson = await response.json();

        if (response.status == 200) {
          Alert.alert(JSON.stringify(responseJson));
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
        <Picker
          selectedValue={this.state.selectedLocation}
          style={{ height: 50, width: 100 }}
          onValueChange={(item, itemIndex) => this.setState({selectedLocation: item})}>
          {this.state.locations.map((item, key) => {
            return (
              <Picker.Item label={item.name} value={item.betriebsnummer} />
            );
          })}
        </Picker>
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