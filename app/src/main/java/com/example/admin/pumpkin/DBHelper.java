package com.example.admin.pumpkin;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.text.style.TtsSpan;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;

/**
 * Created by java-3-02 on 01.02.2017.
 */

public class DBHelper extends OrmLiteSqliteOpenHelper{

    private static final String DATABASE_NAME = "database.db3";
    private static final int DATABASE_VERSION = 1;

    private Dao<User, Integer> userDao = null;
    private RuntimeExceptionDao<User, Integer> userRuntimeDao = null;

    private Dao<Recently, Integer> recentlyDao = null;
    private RuntimeExceptionDao<Recently, Integer> recentlyRuntimeDao = null;

    private Dao<Message>


    public DBHelper(Context context, String databaseName, SQLiteDatabase.CursorFactory factory, int databaseVersion) {
        super(context, databaseName, factory, databaseVersion);
    }


    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {


    }

    public RuntimeExceptionDao<User, Integer> getUserRuntimeDao() {
        if (userRuntimeDao == null) {
            try {
                userRuntimeDao = getRuntimeExceptionDao(User.class);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return userRuntimeDao;
    }
    public Dao<Recently, Integer>
}
