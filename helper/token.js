import { Alert } from 'react-native';

class TokenHelper {
  constructor() {
    Alert.alert("Create Token")
    this._token = '';
  }

  get token() {
    return this._token;
  }

  set token(tokenString) {
    ALert.alert("token: " + tokenString)
    this._token = tokenString;
  }
}

const helper = new TokenHelper();

export default helper;