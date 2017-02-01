package com.example.admin.pumpkin;

import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;

/**
 * Created by java-3-02 on 01.02.2017.
 */

public class HelperFactory {

    private static DBHelper databaseHelper;

    public DBHelper getHelper(){return databaseHelper;}

    public void  setHelper(Context context){
        databaseHelper = OpenHelperManager. getHelper(context, DBHelper.class);
    }
    public void  releaseHelper(){
        OpenHelperManager.releaseHelper();
        databaseHelper = null;
    }
    public  synchronized void  InsertUser(User user) throws Exception {
            RuntimeExceptionDao<User, Integer> userRuntimeDao;
            Dao.CreateOrUpdateStatus res = databaseHelper.getUserRuntimeDao().createOrUpdate(user);
    }

    private  User FindUserByServerId(int userId){
        RuntimeExceptionDao<User, Integer> USERDao = databaseHelper.getUserRuntimeDao();
        QueryBuilder<User, Integer> query = USERDao.queryBuilder();
        try {
            query.where().eq("id", userId);
            return query.queryForFirst();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
