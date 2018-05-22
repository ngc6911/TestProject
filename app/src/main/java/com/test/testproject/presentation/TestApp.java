package com.test.testproject.presentation;

import android.app.Activity;
import android.app.Application;

import com.test.testproject.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerApplication;

public class TestApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this)
                .build()
                .inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityDispatchingAndroidInjector;
    }
}
