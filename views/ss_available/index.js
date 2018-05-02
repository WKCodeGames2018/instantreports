import React, { Component } from 'react';
import { AppRegistry, View, Button, TextInput, Picker, Input, Alert } from 'react-native';

export default class SocialSecurity extends Component {
  constructor(props) {
    super(props);
    this.state = {
      surName: "surname",
      firstName: "firstname",
      entranceDate: 1525273779950,
      socialSecurityNo: "ss_no",
      selectedLocation: "",
      locations: [
        {
          "name": "Restaurant Wok n Roll",
          "betriebsnummer": "99999998",
        }
      ]
    }

    this._register = function () {
      Alert.alert("Yolo")
    }
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
          title="QR-Code"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />     
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => SocialSecurity);