package com.test.testproject.presentation.mainscreen.fragments;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.testproject.BR;
import com.test.testproject.R;
import com.test.testproject.databinding.FragmentGoodsListBinding;
import com.test.testproject.presentation.base.BaseFragment;
import com.test.testproject.presentation.mainscreen.adapters.ProductsListAdapter;

import javax.inject.Inject;

public class ProductsListFragment extends BaseFragment<FragmentGoodsListBinding, ProductsListViewModel> {

    public static ProductsListFragment newInstance() {
        return new ProductsListFragment();
    }

    @Inject
    ViewModelProvider.Factory factory;

    @Inject
    public ProductsListFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);
        FragmentGoodsListBinding binding = getViewDataBinding();

        ProductsListAdapter adapter =
                new ProductsListAdapter();
        binding.rcvGoodsList.setAdapter(adapter);
        return v;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_goods_list;
    }

    @Override
    public ProductsListViewModel getViewModel() {
        return ViewModelProviders.of(this, factory).get(ProductsListViewModel.class);
    }

    @Override
    public int getBindingVariable() {
        return BR.viewmodel;
    }
}
