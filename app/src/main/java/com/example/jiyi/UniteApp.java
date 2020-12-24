package com.example.jiyi;

import android.app.Application;

import com.example.jiyi.db.DBManager;

import org.xutils.x;
//表示全局应用的类

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化数据库
        DBManager.initDB(getApplicationContext());
        x.Ext.init(this);
    }
}
