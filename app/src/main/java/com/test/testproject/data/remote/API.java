package com.test.testproject.data.remote;

import com.test.testproject.data.remote.responses.Response;
import com.test.testproject.data.remote.responses.SearchResponse;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {

    String API_BASE = "https://api.jeench.com/";

    @GET("{apiVersion}/search-items")
    Single<Response<List<SearchResponse>>> getSearchResponse(@Path("apiVersion") String apiVersion);
}
