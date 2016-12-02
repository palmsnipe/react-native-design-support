package com.palmsnipe.rndesignsupport;

import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class TextInputLayoutManager extends ViewGroupManager<TextInputLayout> {

  public static final String REACT_CLASS = "RCTTextInputLayout";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public TextInputLayout createViewInstance(ThemedReactContext context) {
    TextInputLayout textInputLayout = new TextInputLayout(context);
    textInputLayout.setHintAnimationEnabled(true);
    return textInputLayout;
  }

  public boolean needsCustomLayoutForChildren() {
    return true;
  }
//
  @ReactProp(name = "hint")
  public void setHint(TextInputLayout view, @Nullable String hintText) {
    view.setHint(hintText);
  }

  @ReactProp(name = "hintAnimationEnabled")
  public void setHintAnimationEnabled(TextInputLayout view, boolean hintAnimationEnabled) {
    view.setHintAnimationEnabled(hintAnimationEnabled);
  }

  @ReactProp(name = "errorEnabled")
  public void setErrorEnabled(TextInputLayout view, boolean errorEnabled) {
    view.setErrorEnabled(errorEnabled);
  }

  @ReactProp(name = "error")
  public void setError(TextInputLayout view, @Nullable String errorMessage) {
    view.setError(errorMessage);
  }

  @ReactProp(name = "counterEnabled")
  public void setCounterEnabled(TextInputLayout view, boolean counterEnabled) {
    view.setCounterEnabled(counterEnabled);
  }

  @ReactProp(name = "counterMaxLength")
  public void setCounterMaxLength(TextInputLayout view, @Nullable int counterMaxLength) {
    view.setCounterMaxLength(counterMaxLength);
  }

  @ReactProp(name = "passwordToggleDrawable")
  public void setPasswordToggleDrawable(TextInputLayout view, boolean passwordToggleEnabled) {
    view.setPasswordVisibilityToggleEnabled(passwordToggleEnabled);
  }
}
