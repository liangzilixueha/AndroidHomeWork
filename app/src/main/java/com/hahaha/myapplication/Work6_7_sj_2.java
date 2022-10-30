package com.hahaha.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/*
 * 作业内容：编写一个广播接收器，接收自定义广播，接收到广播后，弹出Toast提示“收到广播”。
 * 第六、七章 作业及上机练习
 * 本次作业需要两个文件
 * {
 *  1. MyReceiver.java
 *  2. Work6_7_sj_2.java
 * }
 * 注意在 AndroidManifest.xml 中注册 MyReceiver
 */
public class Work6_7_sj_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work67_sj2);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent("com.hahaha.myapplication.MyReceiver");
            /*
            版本限制
            Android 8.0（API 级别 26）开始，Android 引入了一种新的机制来限制应用程序的广播接收器
            以防止恶意应用程序滥用它们
            下面这句话是为了兼容 Android 8.0 以上的版本
             */
            intent.setComponent(new ComponentName("com.hahaha.myapplication"
                    , "com.hahaha.myapplication.MyReceiver"));
            sendBroadcast(intent);
        });
    }
}