import React, { Component } from 'react';
import { AppRegistry, TextInput, Text, View, Button, Alert, StyleSheet,ImageBackground } from 'react-native';
import tokenHelper from '../../helper/token';

export default class LoginView extends Component {
  constructor(props) {
    super(props);
    this.state = { 
      orga: 'codegames', // clientnumber
      user: 'ben.anderson',
      password: '123',
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

        if (response.status == 200) {
          tokenHelper.token = responseJson.access_token;
          this.props.navigation.navigate('List');
        } else {
          Alert.alert("Oo smth. went wrong, pls check your inputs");
        }
        
      } catch (error) {
        console.error(error);
      }
    }
  }

  render() {
    return (
      <View style={styles.container}>
      <ImageBackground source={require('../../assets/images/back.png')} style={styles.backgroundImage} >
        <TextInput
        style={styles.field}
        underlineColorAndroid={'transparent'}
         
          autoCapitalize={'none'}
          onChangeText={(orga) => this.setState({orga})}
          value={this.state.orga} 
        /> 
        <TextInput
         underlineColorAndroid={'transparent'}
        style={styles.field}
          autoCapitalize={'none'}        
          onChangeText={(user) => this.setState({user})}
          value={this.state.user}
        />
        <TextInput style={styles.field}
          autoCapitalize={'none'}
          underlineColorAndroid={'transparent'} 
          onChangeText={(password) => this.setState({password})} 
          value={this.state.password}
          password = {true}
          secureTextEntry={true}
        />
        <View style={styles.send}>
          <Button 
            onPress={this._onPress.bind(this)}
            title="Log In!"
            accessibilityLabel="Learn more about this purple button"
          />   
          </View>
         
        </ImageBackground>    
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => LoginView);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#eee',

  }, 
  backgroundImage: {
    flex: 1,
    width: null,
    height: null,
    padding:20,
    paddingTop:70,  
  },
  field:{
   
    padding:4,
    margin:8,
    backgroundColor:'#fff', 
    borderRadius: 4, 
    borderWidth: 0.5,
    borderColor: '#d6d7da',
  },
  send:{
padding:40,

  }
});