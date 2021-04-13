import React, { PureComponent } from 'react';
import PropTypes from 'prop-types';
import { withStyles, css, withStylesPropTypes } from '../../doit-ui/withStyles';
import AppNav, { HEIGHT } from './AppNav';
import CoinOverview from './main/CoinOverview';

class AppLayout extends PureComponent {
  render() {
    const { children, styles } = this.props;
    return (
      <div {...css(styles.wrapper)}>
        <AppNav />
          <CoinOverview/>
      </div>
    );
  }
}

AppLayout.propTypes = {
  ...withStylesPropTypes,
  children: PropTypes.node,
};

export default withStyles(({ unit }) => ({
  wrapper: {
    marginTop: HEIGHT,
  },
  body: {
    padding: unit * 4,
  },
}))(AppLayout);
