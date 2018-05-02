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

export default new TokenHelper();