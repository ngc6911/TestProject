package com.test.testproject.presentation.mainscreen;

import android.arch.lifecycle.ViewModelProvider;

import com.test.testproject.di.ActivityScoped;
import com.test.testproject.presentation.ViewModelProviderFactory;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {


    @Provides
    @ActivityScoped
    ViewModelProvider.Factory viewModelProvider(MainViewModel mainViewModel) {
        return new ViewModelProviderFactory<>(mainViewModel);
    }

    @Provides
    MainViewModel provideViewModel() {
        return new MainViewModel();
    }
}
