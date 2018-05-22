package com.test.testproject.data.local;

import com.test.testproject.data.Repository;
import com.test.testproject.data.local.db.TestDatabase;
import com.test.testproject.data.local.db.entities.RecordEntity;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class LocalDataSource implements Repository.LocalDS {

    private TestDatabase mTestDatabase;

    @Inject
    public LocalDataSource(TestDatabase testDatabase) {
        mTestDatabase = testDatabase;
    }

    @Override
    public void putGoods(List<RecordEntity> recordEntities) {
        mTestDatabase.getRecordsDao().putRecords(recordEntities);
    }

    @Override
    public Single<List<RecordEntity>> getGoods() {
        return mTestDatabase.getRecordsDao().getRecords();
    }
}
