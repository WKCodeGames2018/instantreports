import React, { Component } from 'react';
import { AppRegistry, View, Button, Text, TextInput, Picker, PickerIOS, Platform, Input, Alert,StyleSheet, TouchableWithoutFeedback, TouchableOpacity, Modal  } from 'react-native';
import DatePicker from 'react-native-datepicker'
import config  from '../../helper/config';
import tokenHelper from '../../helper/token';
import cache from '../../helper/cache';
import IOSPicker from 'react-native-ios-picker';

class FormPicker extends Component {
  constructor(props) {
    super(props);
    this.state = {
      modalVisible: false,
    };
  }

  render() {
    if (Platform.OS === 'android') {
      return (
        <Picker
          selectedValue={this.props.value}
          onValueChange={this.props.onValueChange}>
          {this.props.items.map((i, index) => (
            <Picker.Item key={index} label={i.label} value={i.value} />
          ))}
        </Picker>
      );
    } else {
      const selectedItem = this.props.items.find(
        i => i.betriebsnummer === this.props.betriebsnummer
      );
      const selectedLabel = selectedItem ? selectedItem.name : '';
      return (
        <View style={styles.inputContainer}>
          <TouchableOpacity
            onPress={() => this.setState({ modalVisible: true })}>
            <TextInput
              style={styles.input}
              editable={false}
              placeholder="Select language"
              onChangeText={searchString => {
                this.setState({ searchString });
              }}
              value={selectedLabel}
            />
          </TouchableOpacity>
          <Modal
            animationType="slide"
            transparent={true}
            visible={this.state.modalVisible}>
            <TouchableWithoutFeedback
              onPress={() => this.setState({ modalVisible: false })}>
              <View style={styles.modalContainer}>
                <View style={styles.buttonContainer}>
                  <Text
                    style={{ color: 'blue' }}
                    onPress={() => this.setState({ modalVisible: false })}>
                    Done
                  </Text>
                </View>
                <View>
                  <Picker
                    selectedValue={this.props.value}
                    onValueChange={this.props.onValueChange}>
                    {this.props.items.map((i, index) => (
                      <Picker.Item
                        key={index}
                        label={i.name}
                        value={i.betriebsnummer}
                      />
                    ))}
                  </Picker>
                </View>
              </View>
            </TouchableWithoutFeedback>
          </Modal>
        </View>
      );
    }
  }
}

export default class SocialSecurity extends Component {
  constructor(props) {
    super(props);
    this.state = {
      surName: "surname",
      firstName: "firstname",
      entranceDate: "2018-05-03",
      socialSecurityNo: config.socialSecurityNo,
      selectedLocation: "",
      baseUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/firmendatenapicontract",
      registerUrl: "https://ocde-pg.wktaa.de/sdn/rest/api/payroll/instantmessage",
      locations: [],
      token: `Bearer ${tokenHelper.token}`,
      modalVisible: false
    }

    if(config.scanfield1!=""){
      for (wert of config.scanfield1.split("\n")){

        if(wert.indexOf("X-VSNR:")==0){
          config.socialSecurityNo = wert.substring(7,wert.length-1);
          this.state.socialSecurityNo = config.socialSecurityNo;
      
        }
        if(wert.indexOf("FN:")==0){
     
          config.surName = wert.substring(3,wert.length-1);
          this.state.surName = config.surName.split(" ")[1];
          this.state.firstName = config.surName.split(" ")[0];

        }
      } 
  }else {
      this.state.socialSecurityNo ="";
      this.state.surName = "";
      this.state.firstName = "";      
  }

    this._register = async function () {
      try {        
        let response = await fetch(`${this.state.registerUrl}?organization=${config.orgaId}`, {
          method: 'POST',
          headers: {
            Accept: 'application/json',
            'Authorization': this.state.token,
            'Content-Type': 'application/json',
          },
          body: JSON.stringify({
            vorname: this.state.firstName,
            nachname: this.state.surName,
            svnummer: this.state.socialSecurityNo,
            betriebstaettenummer: this.state.selectedLocation.betriebsnummer,
            eintrittsdatum: this.state.entranceDate
          })
        })
        let responseJson = await response.json();

        if (response.status == 201) {          
          cache.addItem({
            vorname: this.state.firstName,
            nachname: this.state.surName,
            svnummer: this.state.socialSecurityNo,
            betriebstaettenummer: this.state.selectedLocation.betriebsnummer,
            eintrittsdatum: this.state.entranceDate
          })
          this.props.navigation.navigate('List');
        } else {
          Alert.alert("Oo smth. went wrong, pls check your inputs");
        }
        
      } catch (error) {
        Alert.alert("Could not post dude");
      }
    }

    this._getLocations = async function() {
      try {
        const req = new Request(`${this.state.baseUrl}?organization=${config.orgaId}`);

        req.headers = {
          Accept: 'application/json',
          'Authorization': this.state.token
        }
        let response = await fetch(req);
        let responseJson = await response.json();

        if (response.status == 200) {
          this.setState({locations: responseJson.data[0].betriebsstaetten})
          this.setState({selectedLocation: this.state.locations[0]})
        } else {
          Alert.alert("Oo smth. went wrong, response code " + response.status);
        }
      } catch (e) {
        Alert.alert("Could not fetch locations");
      }
    }

    this._getLocations();
  }

  render() {
    return (
      <View style={styles.container}>
        <View>       
          <DatePicker 
            style={styles.picker}
            date={this.state.entranceDate}
            mode="date"
            placeholder="select date"
            format="YYYY-MM-DD"
            minDate="2018-05-03"
            maxDate="2018-07-01"
            confirmBtnText="Confirm"  
            cancelBtnText="Cancel"
            showIcon={true}
            customStyles={{
            dateIcon: {
              position: 'absolute',
              left: 0,
              top: 4,
              marginLeft: 0
            },
            dateInput: {
              marginLeft: 36
            }
            // ... You can check the source to find the other keys.
          }}
          onDateChange={(date) => {this.setState({entranceDate: date})}}
          />     
       </View>
       {this.state.locations && this.state.locations.length > 0 && Platform.OS !== 'ios' ? 
        <View>
          <Picker
            selectedValue={this.state.selectedLocation}
            onValueChange={(item, itemIndex) => this.setState({selectedLocation: item})}>
            {this.state.locations.map((item, key) => {
              return (
                <Picker.Item label={item.name} key={key} value={item.betriebsnummer} />
              );
            })}
          </Picker>
        </View>
        : null} 
        {this.state.locations && this.state.locations.length > 0 && Platform.OS === 'ios' ? 
        <View>
          <FormPicker
          items={this.state.locations}
          value={this.state.selectedLocation}
          onValueChange={itemValue => this.setState({ selectedLocation: itemValue })}
          />
          /* <IOSPicker mode='modal'
            selectedValue={this.state.selectedLocation}
            onValueChange={(item, itemIndex) => this.setState({selectedLocation: item})}
            collapseViewStyle={{backgroundColor:'white'}}>
            { 
              this.state.locations.map((item, key) =>
                <Picker.Item label={item.name} key={key} value={item.betriebsnummer} />
              )
            }
          </IOSPicker> */
          /* <PickerIOS
            selectedValue={this.state.selectedLocation}
            onValueChange={(item, itemIndex) => this.setState({selectedLocation: item})}>
            {this.state.locations.map((item, key) => {
              return (
                <PickerIOS.Item label={item.name} key={key} value={item.betriebsnummer} />
              );
            })}
          </PickerIOS> */
        </View>
        : null}
        <TextInput style={styles.field}
          onChangeText={(socialSecurityNo) => this.setState({socialSecurityNo})}
          value={this.state.socialSecurityNo}
        />
        <TextInput style={styles.field}
          onChangeText={(surName) => this.setState({surName})}
          placeholder="surname" 
          value={this.state.surName}
          
        />
        <TextInput style={styles.field}
          onChangeText={(firstName) => this.setState({firstName})}
          placeholder="firstname"
          value={this.state.firstName}
          
        />
      
          <View style={styles.send}>
        <Button
          onPress={this._register.bind(this)}
          title="Send Data"
          accessibilityLabel="Learn more about this purple button"
        />     
        </View>
    </View>      
    );
  }
}
 
// skip this line if using Create React Native App
AppRegistry.registerComponent('codegames', () => SocialSecurity);

const styles = StyleSheet.create({
  inputContainer: {
    ...Platform.select({
      ios: {
        borderBottomColor: 'gray',
        borderBottomWidth: 1,
      },
    }),
  },
  input: {
    height: 40,
  },
  modalContainer: {
    flex: 1,
    justifyContent: 'flex-end',
  },
  buttonContainer: {
    justifyContent: 'flex-end',
    flexDirection: 'row',
    padding: 4,
    backgroundColor: '#ececec',
  },
  content: {
    marginLeft: 15,
    marginRight: 15,
    marginBottom: 5,
    alignSelf: 'stretch',
    justifyContent: 'center',
  },
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
    margin:10,
    backgroundColor:'#fff', 
    borderRadius: 4, 
    borderWidth: 0.5,
    borderColor: '#d6d7da',
    fontSize:18,
  },
  picker:{

    height:50,
    padding:4,
    margin:10,
    backgroundColor:'#fff', 
    borderRadius: 4, 
    borderWidth: 0.5,
    borderColor: '#d6d7da',

  },
  send:{
padding:10,

  }
});