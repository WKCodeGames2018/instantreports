import { Alert } from 'react-native';

class TokenHelper {
  constructor() {
    this._token = '';
  }

  get token() {
    return this._token;
  }

  set token(tokenString) {
    this._token = tokenString;
  }
}

const helper = new TokenHelper();

export default helper;