package com.example.jiyi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jiyi.db.DBOpenHelper;

public class NewStickerActivity extends AppCompatActivity implements View.OnClickListener {
    Button publishBtn;
    Button chooseLocationBtn;
    Button addLableBtn;
    EditText stickerEdit;
    SQLiteDatabase db;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //指定从哪个布局找Id
        setContentView(R.layout.activity_new_sticker);

        publishBtn = (Button)findViewById(R.id.publishBtn);
        chooseLocationBtn = (Button)findViewById(R.id.chooseLocationBtn);
        addLableBtn = (Button)findViewById(R.id.addLableBtn);
        stickerEdit = (EditText) findViewById(R.id.stickerEdit);
        //设置监听器
        publishBtn.setOnClickListener((View.OnClickListener) this);
        chooseLocationBtn.setOnClickListener((View.OnClickListener)this);
        addLableBtn.setOnClickListener((View.OnClickListener)this);

        //依靠DatabaseHelper的构造函数创建数据库
        DBOpenHelper dbHelper = new DBOpenHelper(NewStickerActivity.this);
        db = dbHelper.getWritableDatabase();

        initView();
    }

    private void initView(){


    }

    public void onClick(View v) {
        //获取输入框的数据
        String stickerText = stickerEdit.getText().toString();

        switch (v.getId()){
            //插入数据按钮
            case R.id.publishBtn:
                //创建存放数据的ContentValues对象
                ContentValues values = new ContentValues();
                values.put("stickerText", stickerText);
                // 数据库执行插入命令
                db.insert("Sticker",null,values);
                showEnsure(v);
                break;

        }
    }

    public void showEnsure(View v) {
        //发布便利贴成功dialog
        AlertDialog.Builder publishDialogBuilder = new AlertDialog.Builder(this);

    }

    public static class MapActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_map);
        }
    }
}