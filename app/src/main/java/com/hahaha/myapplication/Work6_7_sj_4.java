package com.hahaha.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Work6_7_sj_4 extends AppCompatActivity {

    private static final String TAG = "csw";
    private static TextView textView;
    private static String text = "";
    private Button start;
    private Button stop;
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            return false;
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work67_sj4);
        textView = (TextView) findViewById(R.id.textView);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        Intent intent = new Intent();
        intent.setAction("com.hahaha.myapplcation.MyService");
        intent.setComponent(new ComponentName("com.hahaha.myapplication",
                "com.hahaha.myapplication.MyService"));
        //为两个按钮设置点击事件,分别是启动与停止service
        start.setOnClickListener(view -> {
            startService(intent);
        });
        stop.setOnClickListener(view -> {
            stopService(intent);
        });
    }
    public static void change(){
        TextView textView = Work6_7_sj_4.textView;
        //随机生成一个数字
        int i = (int) (Math.random() * 10000);
        textView.setText(i+ "");
    }
}