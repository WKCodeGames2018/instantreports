import React, { Component } from 'react';
import { AppRegistry, View, Button } from 'react-native';

export default class SelectModeView extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <View>
        <Button
          onPress={() => this.props.navigation.navigate('QR')}
          title="QR-Code"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />  
        <Button
          onPress={() => this.props.navigation.navigate('Details')}
          title="Social-Security-No. available"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />
        <Button
          onPress={() => this.props.navigation.navigate('Details')}
          title="Social-Security-No. not available"
          color="#841584"
          accessibilityLabel="Learn more about this purple button"
        />        
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => SelectModeView);