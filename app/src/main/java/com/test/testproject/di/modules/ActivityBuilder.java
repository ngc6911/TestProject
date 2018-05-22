package com.test.testproject.di.modules;

import com.test.testproject.di.ActivityScoped;
import com.test.testproject.presentation.mainscreen.MainActivity;
import com.test.testproject.presentation.mainscreen.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ActivityScoped
    @ContributesAndroidInjector(modules = {
            MainActivityModule.class})
    abstract MainActivity bindMainActivity();

}
