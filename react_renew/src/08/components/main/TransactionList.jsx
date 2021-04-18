import React, { PureComponent } from 'react';
import Api from '../../Api';
import Heading from '../../../doit-ui/Heading';
import Card from '../../../doit-ui/Card';

// 8장 참조 코드
import TransactionSearchFilterContainer from '../../containers/main/TransactionSearchFilterContainer';
import TransactionTable from './TransactionTable';

// import TransactionPaginationContainer from '../../containers/main/TransactionPaginationContainer';

class TransactionList extends PureComponent {

  componentDidMount() {
    Api.get('/transactions')
      .then(({ data }) => this.props.setTransactionList(data));
    /*
    9-2 참조 코드

    */
    /*
    9-3 참조 코드
    Api.get('/transactions')
      .then(({ data }) => this.props.setTransactionList(data));
    */
    /*
    10-2 참조 코드
    this.props.requestTransactionList();
    */
  }

  render() {
    const { transactions } = this.props;
    // const { transactions, loading } = this.props;
    return (
      <div>
        <Heading level={3}>거래 현황</Heading>
        <Card vertical={4} horizontal={4}>
          <TransactionSearchFilterContainer />
        </Card>
        <Card>
          <TransactionTable transactions={transactions} />
        </Card>
      </div>
    );
  }
}
//
TransactionList.defaultProps = {
  transactions: [],
  requestTransactionList: () => {},
};

export default TransactionList;