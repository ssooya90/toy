import React, { PureComponent } from 'react';
import Api from '../../Api';
import Heading from '../../../doit-ui/Heading';
import Card from '../../../doit-ui/Card';

// 8장 참조 코드
import TransactionSearchFilter from './TransactionSearchFilter';
import TransactionTable from './TransactionTable';

// import TransactionSearchFilterContainer from '../../containers/main/TransactionSearchFilterContainer';
// import TransactionPaginationContainer from '../../containers/main/TransactionPaginationContainer';

class TransactionList extends PureComponent {
  state = {
    transactions: [

    ],
  }

  componentDidMount() {
    Api.get('http://localhost:4000/transactions', { params: { code: 'BTX' } })
      .then(response => this.setState({ transactions: response.data }));
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
    const { transactions } = this.state;
    // const { transactions, loading } = this.props;
    return (
      <div>
        <Heading level={3}>거래 현황</Heading>
        <Card vertical={4} horizontal={4}>
          <TransactionSearchFilter />
        </Card>
        <Card>
          <TransactionTable transactions={transactions} />
        </Card>
      </div>
    );
  }
}
//
// TransactionList.defaultProps = {
//   transactions: [],
//   requestTransactionList: () => {},
// };

export default TransactionList;