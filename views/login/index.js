import React, { Component } from 'react';
import { AppRegistry, TextInput, View, Button, Alert } from 'react-native';

export default class LoginView extends Component {
  constructor(props) {
    super(props);
    this.state = { 
      orga: 'Organame', // clientnumber
      user: 'Username',
      password: 'Password'
    };
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
          onPress={this._onPress}
          title="Log In!"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />
    </View>      
    );
  }

  _onPress() {
    Alert(`${this.state.orga} ${this.state.user} ${this.state.password}`)
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => LoginView);