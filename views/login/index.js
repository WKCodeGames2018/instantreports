import React, { Component } from 'react';
import { AppRegistry, TextInput, View, Button, Alert } from 'react-native';

export default class LoginView extends Component {
  constructor(props) {
    super(props);
    this.state = { 
      orga: 'Organame', // clientnumber
      user: 'Username',
      password: 'Password',
      baseUrl: 'https://pg.dev.two-clicks.de/sdn/oauth/token?response_type=code&grant_type=password' // clientnumber=addisonadmin&username=admin&password=admin
    };

    this._onPress = function() {
      const xhr = new XMLHttpRequest();
      xhr.open("POST", this.state.baseUrl, true);

      xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

      xhr.onreadystatechange = function() {//Call a function when the state changes.
        Alert.alert("hallo")
        if(xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
            // Request finished. Do processing here.
        }
      }

      xhr.send(`clientnumber=${this.state.orga}&username=${this.state.user}&password=${this.state.password}`);
      // Alert.alert(`${this.state.orga} ${this.state.user} ${this.state.password}`)
    }
  }

  render() {
    return (
      <View>
        <TextInput
          onChangeText={(orga) => this.setState({orga})}
          value={this.state.orga}
        />
        <TextInput
          onChangeText={(user) => this.setState({user})}
          value={this.state.user}
        />
        <TextInput
          onChangeText={(password) => this.setState({password})}
          value={this.state.password}
        />
        <Button
          onPress={this._onPress.bind(this)}
          title="Log In!"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => LoginView);