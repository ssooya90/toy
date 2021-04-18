import React, {PureComponent} from 'react';
import {Provider} from 'react-redux';


import ModalProvider from './ModalProvider';
import AppLayout from './components/AppLayout';
import CoinOverview from './components/main/CoinOverview';
import TransactionList from './components/main/TransactionList';
import configureStore from './store/configureStore';


class CoinApp extends PureComponent {

  store = configureStore();

  render () {
    return (

      <Provider store={this.store}>
        <ModalProvider>
          <AppLayout>
            <CoinOverview/>
            <TransactionList/>
          </AppLayout>
        </ModalProvider>
      </Provider>

    );
  }
}

export default CoinApp;