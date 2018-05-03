import React, { Component } from 'react';
import { AppRegistry, View, Button,StyleSheet } from 'react-native';

export default class SelectModeView extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <View style={styles.container}>
      <View style={styles.send}>
        <Button style={styles.send}
          onPress={() => this.props.navigation.navigate('QR')}
          title="QR-Code"
          accessibilityLabel="Learn more about this purple button"
        />  
        </View>
        <View style={styles.send}>
        <Button style={styles.send}
          onPress={() => this.props.navigation.navigate('SocialSecurity')}
          title="Social-Security-No. available"

          accessibilityLabel="Learn more about this purple button"
        />
        </View>
        
         <View style={styles.send}>
        <Button style={styles.send}
          onPress={() => this.props.navigation.navigate('NoSocialSecurity')}
          title="Social-Security-No. not available"

          accessibilityLabel="Learn more about this purple button"
        />      
        </View>
           
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => SelectModeView);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
  },
  send:{
padding:10,

  }
})