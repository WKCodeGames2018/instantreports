import React, { Component } from 'react';
import { WebView,StyleSheet,Alert } from 'react-native';
import config  from '../../helper/config';

export default class PDF extends Component {
    constructor(props) {
        super(props); 
        this.url = config.doc;
     
    }

    render(){
       return (<WebView
        source={{uri: 'http://docs.google.com/viewer?url\x3dhttps%3A%2F%2Focde-pg.wktaa.de/sdn/publicfiles/'+config.doc+'?folder=Documents'}}
        style={{marginTop: 2}}  
      />); 
    }
} 
var styles = StyleSheet.create({
    pdf: {
        flex:1
    }
});