class Cache {
  constructor() {
    this._storage = new Set();
  }

  addItem(item) {    
    return this._storage.add(JSON.stringify(item));
  }

  deleteItem(item) {
    return this._storage.delete(JSON.stringify(item));   
  }

  getItems() {
    return [...this._storage].map(item => JSON.parse(item));
  }

  get length() {
    return this._storage.size;
  }
}

const c = new Cache();

export default c;