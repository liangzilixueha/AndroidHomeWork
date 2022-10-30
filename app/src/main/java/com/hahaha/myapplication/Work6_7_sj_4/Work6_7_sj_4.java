package com.hahaha.myapplication.Work6_7_sj_4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class Work6_7_sj_4 extends AppCompatActivity {

    private TextView textView;
    private Button start;
    private Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work67_sj4);
        textView = (TextView) findViewById(R.id.textView);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        final Intent intent = new Intent();
        intent.setAction("com.hahaha.myapplcation.Work6_7_sj_4.MyService");
        //为两个按钮设置点击事件,分别是启动与停止service
        start.setOnClickListener(view -> {
            try {
                startService(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}