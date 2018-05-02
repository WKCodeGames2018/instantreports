class TokenHelper {
  constructor() {
    this.token = '';
  }

  get token() {
    return this.token;
  }

  set token(tokenString) {
    this.token = tokenString;
  }
}

const helper = new TokenHelper();

export default helper;