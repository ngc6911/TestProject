package com.test.testproject.data;

import com.test.testproject.data.local.db.entities.RecordEntity;
import com.test.testproject.data.remote.responses.SearchResponse;
import com.test.testproject.presentation.model.RecordModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

public interface Repository {

    Flowable<List<RecordModel>> getGoods();

    interface LocalDS {
        void putGoods(List<RecordEntity> recordEntities);
        Single<List<RecordEntity>> getGoods();
    }

    interface RemoteDS {
        Single<List<SearchResponse>> fetchGoods();
    }
}
