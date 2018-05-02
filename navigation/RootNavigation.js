import { Notifications } from 'expo';
import React from 'react';
import { StackNavigator } from 'react-navigation';

import MainTabNavigator from './MainTabNavigator';
import registerForPushNotificationsAsync from '../api/registerForPushNotificationsAsync';

import OverviewListView from '../views/overview';
import LoginView from '../views/login';
import SelectModeView from '../views/selectMode'
import SocialSecurity from '../views/ss_available'
// import SelectModeView from '../views/selectMode'

/* const RootStackNavigator = StackNavigator(
  {
    Main: {
      screen: MainTabNavigator,
    },
  },
  {
    navigationOptions: () => ({
      headerTitleStyle: {
        fontWeight: 'normal',
      },
    }),
  }
); */

const RootStackNavigator = StackNavigator(
  {
    Login: {
      screen: LoginView,
    },
    List: {
      screen: OverviewListView,
    },
    SelectMode: {
      screen: SelectModeView,
    },
    SocialSecurity: {
      screen: SocialSecurityView
    },
    NoSocialSecurity: {
      screen: NoSocialSecurityView
    }
  },
  {
    initialRouteName: 'Login',
  }
);

export default class RootNavigator extends React.Component {
  componentDidMount() {
    this._notificationSubscription = this._registerForPushNotifications();
  }

  componentWillUnmount() {
    this._notificationSubscription && this._notificationSubscription.remove();
  }

  render() {
    return <RootStackNavigator />;
  }

  _registerForPushNotifications() {
    // Send our push token over to our backend so we can receive notifications
    // You can comment the following line out if you want to stop receiving
    // a notification every time you open the app. Check out the source
    // for this function in api/registerForPushNotificationsAsync.js
    registerForPushNotificationsAsync();

    // Watch for incoming notifications
    this._notificationSubscription = Notifications.addListener(this._handleNotification);
  }

  _handleNotification = ({ origin, data }) => {
    console.log(`Push notification ${origin} with data: ${JSON.stringify(data)}`);
  };
}
