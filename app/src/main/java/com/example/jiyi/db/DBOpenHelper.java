package com.example.jiyi.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBOpenHelper extends SQLiteOpenHelper {
    //带全部参数的构造函数，必不可少
    public DBOpenHelper(@Nullable Context context) {
        super(context, "jiyi.db", null, 1); //数据库名字叫jiyi.db
    }

    //创建数据库的方法，只有项目第一次运行时会被调用
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table Sticker(sdate varchar(50),place varchar(50), stickerText varchar(255), tag varchar(50), year integer, month integer,day integer)";
        db.execSQL(sql);
    }
//数据库版本在更新时发生改变，会调用此方法
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
