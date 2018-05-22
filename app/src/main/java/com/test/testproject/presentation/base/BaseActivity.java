package com.test.testproject.presentation.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity<B extends ViewDataBinding, VM extends BaseViewModel>
        extends DaggerAppCompatActivity {

    private B mViewDataBinding;

    @LayoutRes
    public abstract int getLayoutId();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        mViewDataBinding.setVariable(getBindingVariable(), getViewModel());
        mViewDataBinding.executePendingBindings();

    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public B getViewDataBinding() {
        return mViewDataBinding;
    }

    public abstract VM getViewModel();

    public abstract int getBindingVariable();
}
