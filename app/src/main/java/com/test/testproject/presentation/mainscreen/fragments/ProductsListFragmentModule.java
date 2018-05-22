package com.test.testproject.presentation.mainscreen.fragments;

import android.arch.lifecycle.ViewModelProvider;

import com.test.testproject.data.Repository;
import com.test.testproject.di.ActivityScoped;
import com.test.testproject.presentation.ViewModelProviderFactory;
import com.test.testproject.presentation.mainscreen.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class ProductsListFragmentModule {

    @Provides
    ViewModelProvider.Factory viewModelProvider(ProductsListViewModel viewModel) {
        return new ViewModelProviderFactory<>(viewModel);
    }

    @Provides
    ProductsListViewModel provideViewModel(Repository repository) {
        return new ProductsListViewModel(repository);
    }
}
