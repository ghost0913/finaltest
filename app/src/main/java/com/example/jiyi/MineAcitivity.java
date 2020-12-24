package com.example.jiyi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class MineAcitivity extends AppCompatActivity  {
    private ListView timeaixs;
    private ImageButton timeaxis_imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine_activity);
        timeaixs = (ListView) findViewById(R.id.timeaxis_lv);
        timeaxis_imgbtn = (ImageButton) findViewById(R.id.timeaxis_imgbtn);
        timeaxis_imgbtn.setOnClickListener((View.OnClickListener) this);

    }

    public void trooseDay(View view) {

    }

}




