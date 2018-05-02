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
      const data = new FormData();
      data.append('username', this.state.user);
      data.append('password', this.state.password);
      data.append('clientnumber', this.state.org);
      
      xhr.open("POST", this.state.baseUrl, true);

      xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

      xhr.addEventListener("progress", updateProgress);
      xhr.addEventListener("load", transferComplete);
      xhr.addEventListener("error", transferFailed);
      xhr.addEventListener("abort", transferCanceled);

      xhr.onreadystatechange = function() {//Call a function when the state changes.
        
        if(xhr.readyState == XMLHttpRequest.DONE && xhr.status) {
          if (xhr.status === "403") {
            return Alert.alert("403")
          }
          if (xhr.status === "200") {
            return Alert.alert("200")
          }
          if (xhr.status === "401") {
            return Alert.alert("401")
          }
          return Alert.alert(JSON.parse(xhr.status))
        }
      }.bind(this)

      xhr.send({ form: data }); 
      // xhr.send(`clientnumber=${this.state.orga}&username=${this.state.user}&password=${this.state.password}`);
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