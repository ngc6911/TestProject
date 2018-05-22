package com.test.testproject.data.local.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.test.testproject.data.local.db.entities.RecordEntity;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface RecordsDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void putRecord(RecordEntity recordEntity);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void putRecords(List<RecordEntity> recordEntity);

    @Query("SELECT * FROM records")
    Single<List<RecordEntity>> getRecords();

    @Query("SELECT * FROM records")
    List<RecordEntity> getRecordsSync();
}
