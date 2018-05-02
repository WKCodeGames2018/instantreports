import React, { Component } from 'react';
import { AppRegistry, TextInput, View, ListView, Text,StyleSheet,Button} from 'react-native';

export default class OverviewListView extends Component {
  constructor(props) {
    super(props);
    this.state = { text: 'Useless Placeholder' };
    const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1 !== r2});
    this.state = {
      dataSource: ds.cloneWithRows(['row 1', 'row 2']),
    };
  }

  render() {
    return (
      <View style={{width: 50, height: 50, backgroundColor: 'powderblue'}}>
        
      <ListView
        dataSource={this.state.dataSource}
        renderRow={(rowData) => <Text>{rowData}</Text>}
      
      >
      <Button
  onPress={_handlePress}
  title="Add"
  color="#841584"
  accessibilityLabel="Learn more about this purple button"
/></ListView>
    </View>
    );
  } 
}

_handlePress= () => {

}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => OverviewListView);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ff00ff',
  },
});
