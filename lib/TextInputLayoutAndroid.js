import React, { PropTypes } from 'react';
import { requireNativeComponent, View } from 'react-native';

var iface = {
  name: 'RCTTextInputLayout',
  propTypes: {
    ...View.propTypes,
    hint: PropTypes.string,
    hintAnimationEnabled: PropTypes.bool,
    errorEnabled: PropTypes.bool,
    error: PropTypes.string,
    counterEnabled: PropTypes.bool,
    counterMaxLength: PropTypes.number
  }
};

module.exports = requireNativeComponent('RCTTextInputLayout', iface);
