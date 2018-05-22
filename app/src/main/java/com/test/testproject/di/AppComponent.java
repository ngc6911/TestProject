package com.test.testproject.di;

import android.app.Application;

import com.test.testproject.di.modules.ActivityBuilder;
import com.test.testproject.di.modules.FragmentBuilder;
import com.test.testproject.di.modules.RepositoryModule;
import com.test.testproject.presentation.TestApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { ActivityBuilder.class, FragmentBuilder.class,
        AndroidSupportInjectionModule.class, RepositoryModule.class })
public interface AppComponent {

    void inject(TestApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
