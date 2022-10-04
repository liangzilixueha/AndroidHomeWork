package com.hahaha.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Work524 extends AppCompatActivity {

    private TextView blue;
    private TextView yellow;
    private TextView red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work524);
        setTitle("导航栏");
        blue = (TextView) findViewById(R.id.blue);
        yellow = (TextView) findViewById(R.id.yellow);
        red = (TextView) findViewById(R.id.red);
        //默认显示蓝色
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, new Work524Fragment());
        transaction.commit();
        //点击蓝色
        blue.setOnClickListener(v -> {
            FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
            transaction1.replace(R.id.frameLayout, new Work524Fragment(Color.BLUE));
            transaction1.commit();
        });
        //点击黄色
        yellow.setOnClickListener(v -> {
            FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
            transaction1.replace(R.id.frameLayout, new Work524Fragment(Color.YELLOW));
            transaction1.commit();
        });
        //点击红色
        red.setOnClickListener(v -> {
            FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
            transaction1.replace(R.id.frameLayout, new Work524Fragment(Color.RED));
            transaction1.commit();
        });
    }
}