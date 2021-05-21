import {connect} from 'react-redux';
import TransactionList from '../../components/main/TransactionList';
// import {setTransactionList} from '../../actions/transactionActions';
import {requestTransactionList} from '../../actions/transactionActions';

const mapStateToProps = state => {



  const { ids, entities} = state.transactions;
  const transactions = ids.map(id => entities[id]);
  // const { ids, entities, loadingState, pages, pagination } = state.transactions;


  return {transactions}

  // const { pagination } = state.transactions;
  // const transactions = transactionListSelector(state);
  // const loading = transactionListLoadingStateSelector(state);
  // const { number = 1 } = pagination;
  // return { transactions, loading: loading && number === 1 };
};

const mapDispatchToPros = {
  requestTransactionList
};

export default connect(mapStateToProps, mapDispatchToPros)(TransactionList);