package com.test.testproject.di.modules;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.test.testproject.data.Repository;
import com.test.testproject.data.remote.API;
import com.test.testproject.data.remote.RemoteDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class RemoteDataSourceModule {

    public static final String API_VERSION = "v1";

    @Provides
    @Singleton
    public OkHttpClient provideOkHttpClient(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofit(OkHttpClient okHttpClient){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        return new Retrofit.Builder()
                .baseUrl(API.API_BASE)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    public API provideApi(Retrofit retrofit){
        return retrofit.create(API.class);
    }

    @Provides
    @Singleton
    public Repository.RemoteDS provideRemoteDataSource(API api){
        return new RemoteDataSource(api, API_VERSION);
    }
}
