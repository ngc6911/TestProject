package com.test.testproject.data;

import com.test.testproject.data.local.db.entities.RecordEntity;
import com.test.testproject.presentation.model.RecordModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.Single;

public class RepositoryImpl implements Repository {

    private RemoteDS mRemoteDS;
    private LocalDS mLocalDS;

    @Inject
    public RepositoryImpl(RemoteDS remoteDS, LocalDS localDS) {
        mRemoteDS = remoteDS;
        mLocalDS = localDS;
    }

    @Override
    public Flowable<List<RecordModel>> getGoods() {
        Single<List<RecordModel>> cachedRecords = mLocalDS.getGoods().map(DataUtils::entitiesToModel);

        Single<List<RecordModel>> fetchedRecords = mRemoteDS.fetchGoods()
                .map(searchResponses -> {
                    List<RecordEntity> entities = DataUtils.responsesToEntity(searchResponses);
                    mLocalDS.putGoods(entities);
                    return DataUtils.entitiesToModel(entities); });

        return Single.concat(cachedRecords, fetchedRecords);
    }
}
