import React, { Component } from 'react';
import { AppRegistry, TextInput, View } from 'react-native';

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
          onPress={onPressLearnMore}
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