package com.hahaha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Work524 extends AppCompatActivity {

    private TextView blue;
    private TextView yellow;
    private TextView red;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work524);
        setTitle("导航栏");
        blue = (TextView) findViewById(R.id.blue);
        yellow = (TextView) findViewById(R.id.yellow);
        red = (TextView) findViewById(R.id.red);
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
    }
}