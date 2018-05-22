package com.test.testproject.di.modules;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.test.testproject.data.Repository;
import com.test.testproject.data.local.LocalDataSource;
import com.test.testproject.data.local.db.TestDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LocalDataSourceModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    TestDatabase provideDatabase(Context context) {
        return Room.databaseBuilder(context, TestDatabase.class, TestDatabase.DB_NAME).build();
    }

    @Provides
    @Singleton
    Repository.LocalDS provideLocalDS(TestDatabase testDatabase){
        return new LocalDataSource(testDatabase);
    }

}
