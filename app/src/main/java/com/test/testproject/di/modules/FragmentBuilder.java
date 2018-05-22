package com.test.testproject.di.modules;

import com.test.testproject.presentation.mainscreen.fragments.ProductsListFragment;
import com.test.testproject.presentation.mainscreen.fragments.ProductsListFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuilder {


    @ContributesAndroidInjector(modules = {
            ProductsListFragmentModule.class})
    abstract ProductsListFragment bindProdListFragment();

}