package com.test.testproject.presentation.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagger.android.support.DaggerFragment;

public abstract class BaseFragment<B extends ViewDataBinding, VM extends BaseViewModel>
        extends DaggerFragment{

    private B mViewDataBinding;
    private VM mViewModel;

    @LayoutRes
    public abstract int getLayoutId();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = getViewModel();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewDataBinding = DataBindingUtil
                .inflate(inflater, getLayoutId(), container, false);
        return mViewDataBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewDataBinding.setVariable(getBindingVariable(), mViewModel);
        mViewDataBinding.executePendingBindings();
    }

    public B getViewDataBinding() {
        return mViewDataBinding;
    }

    public abstract VM getViewModel();

    public abstract int getBindingVariable();

}
