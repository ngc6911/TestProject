package com.test.testproject.data.local.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.test.testproject.data.local.db.dao.RecordsDao;
import com.test.testproject.data.local.db.entities.RecordEntity;

@Database(entities = {RecordEntity.class}, version = 1)
public abstract class TestDatabase extends RoomDatabase {

    public static final String DB_NAME = "test.db";

    public abstract RecordsDao getRecordsDao();

}
