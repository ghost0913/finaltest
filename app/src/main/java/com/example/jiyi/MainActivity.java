package com.example.jiyi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{


    ImageButton main_btn_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //点击加号发布便利贴

    public void addSticker(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, NewStickerActivity.class);
        startActivity(intent);
    }

    public void maptest(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MapActivity.class);
        startActivity(intent);

    }
}

