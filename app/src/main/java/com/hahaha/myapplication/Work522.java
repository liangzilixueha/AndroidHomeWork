package com.hahaha.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

public class Work522 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work522);
        //设置子菜单
        setTitle("子菜单");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //设置菜单
        getMenuInflater().inflate(R.menu.work522, menu);
        return super.onCreateOptionsMenu(menu);
    }
}