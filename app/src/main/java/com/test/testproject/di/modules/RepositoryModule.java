package com.test.testproject.di.modules;

import com.test.testproject.data.Repository;
import com.test.testproject.data.RepositoryImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {LocalDataSourceModule.class, RemoteDataSourceModule.class})
public class RepositoryModule {

    @Provides
    @Singleton
    Repository provideRepository(Repository.LocalDS localDS, Repository.RemoteDS remoteDS){
        return new RepositoryImpl(remoteDS, localDS);
    }
}
