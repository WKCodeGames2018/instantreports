class Cache {
  contructor() {
    this._storage = new Map();
  }

  addItem(key, item) {    
    return this._storage.set(key, item);
  }

  getItem(key) {
    let val = null;

    if (this._storage.has(key)) {
      val = this._storage.get(key)
      this._storage.delete(key)
    }

    return val;
  }

  length() {
    return this._storage.size
  }
}

const c = new Cache();

export default c;