package com.example.jiyi.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

//负责管理数据库的类，对数据库表进行增删改查
public class DBManager {

    private static SQLiteDatabase db;
    //初始化数据库对象
    public static void initDB(Context context){
        DBOpenHelper helper = new DBOpenHelper(context); //得到帮助类对象
        db = helper.getWritableDatabase(); // 得到数据库对象
    }

    //读取数据库中的数据，写入内存集合里

}
