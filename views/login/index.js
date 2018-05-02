import React, { Component } from 'react';
import { AppRegistry, TextInput, View } from 'react-native';

export default class LoginView extends Component {
  constructor(props) {
    super(props);
    this.state = { text: 'Useless Placeholder' };
  }

  render() {
    return (
      <View>
      <TextInput
        onChangeText={(text) => this.setState({text})}
        value={this.state.text}
      />
      <TextInput
        onChangeText={(text) => this.setState({text})}
        value={this.state.text}
      />
      <TextInput
        onChangeText={(text) => this.setState({text})}
        value={this.state.text}
      />
    </View>
      
    );
  }
}

// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => LoginView);