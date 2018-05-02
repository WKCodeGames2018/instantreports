import React, { Component } from 'react';
import { AppRegistry, TextInput, View, ListView } from 'react-native';

export default class OverviewListView extends Component {
  constructor(props) {
    super(props);
    this.state = { text: 'Useless Placeholder' };
  }

  render() {
    return (
      <View>
      
    </View>
      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => OverviewListView);git 