import React, { Component } from 'react';
import { AppRegistry, TextInput, Text, View, Button, Alert } from 'react-native';
import { StackNavigator } from 'react-navigation';
import OverviewListView from '../overview'
import tokenHelper from '../../helper/token'


export default class LoginView extends Component {
  constructor(props) {
    super(props);
    this.state = { 
      orga: 'orga', // clientnumber
      user: 'ben.anderson',
      password: 'Password',
      baseUrl: 'https://ocde-pg.wktaa.de/sdn/oauth/token?response_type=code&grant_type=password',
      responseCode: 0,
      reqBody: 'body',
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
          body: `clientnumber=${this.state.orga}&username=${this.state.user}&password=${this.state.password}`
        });
        let responseJson = await response.json();

        if (responseJson.status == 200) {
          tokenHelper.token = responseJson.access_token;

        }
        
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
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => LoginView);