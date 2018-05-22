package com.test.testproject.data.remote;

import com.test.testproject.data.Repository;
import com.test.testproject.data.remote.responses.Response;
import com.test.testproject.data.remote.responses.SearchResponse;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class RemoteDataSource implements Repository.RemoteDS {

    private API mApi;
    private String mApiVersion;

    @Inject
    public RemoteDataSource(API api, String apiVersion) {
        mApi = api;
        mApiVersion = apiVersion;
    }

    @Override
    public Single<List<SearchResponse>> fetchGoods() {
        return mApi.getSearchResponse(mApiVersion).map(Response::getMessage);
    }
}
