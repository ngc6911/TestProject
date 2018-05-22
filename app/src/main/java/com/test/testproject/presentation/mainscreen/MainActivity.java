package com.test.testproject.presentation.mainscreen;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.test.testproject.BR;
import com.test.testproject.R;
import com.test.testproject.databinding.ActivityMainBinding;
import com.test.testproject.presentation.base.BaseActivity;
import com.test.testproject.presentation.mainscreen.fragments.ProductsListFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    @Inject
    ViewModelProvider.Factory factory;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment fragment = fragmentManager.findFragmentById(R.id.content_frame);

        if (fragment == null) {
            fragmentManager
                    .beginTransaction()
                    .add(R.id.content_frame, ProductsListFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(MainViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewmodel;
    }
}
