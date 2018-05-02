import React, { Component } from 'react';
import { AppRegistry, TextInput, View, Button, Alert } from 'react-native';

export default class LoginView extends Component {
  constructor(props) {
    super(props);
    this.state = { 
      orga: 'orga', // clientnumber
      user: 'ben.anderson',
      password: 'Password',
      baseUrl: 'https://ocde-pg.wktaa.de/sdn/oauth/token?response_type=code&grant_type=password',
      responseCode: 0,
      response: 'empty' // clientnumber=addisonadmin&username=admin&password=admin
    };

    this._onPress = async function() {
      try {
        let response = await fetch(this.state.baseUrl, {
          method: 'POST',
          headers: {
            Accept: 'application/json',
            'Content-Type': 'application/x-www-form-urlencoded',
          },
          body: JSON.stringify({
            username: this.state.user,
            password: this.state.password,
            clientnumber: this.state.orga
          }),
        });
        let responseJson = await response.json();
        this.setState({
          response: JSON.stringify(responseJson),
          responseCode: responseJson.status
        })
        // return Alert.alert(`${this.state.orga} ${this.state.user} ${this.state.password} ${JSON.stringify(responseJson)}`);
      } catch (error) {
        console.error(error);
      }
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
        <text>
         {this.state.responseCode}
        </text>
        <text>
          {this.state.response}
        </text>
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => LoginView);