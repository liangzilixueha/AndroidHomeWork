package com.hahaha.myapplication.Chapter8;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class Num1_2 extends AppCompatActivity {

    private TextView id;
    private TextView pwd;

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num12);
        sp = getSharedPreferences("save", MODE_PRIVATE);
        id = (TextView) findViewById(R.id.id);
        pwd = (TextView) findViewById(R.id.pwd);
        if (getIntent().getType().equals("num1_1")) {
            id.setText("你的账号是：" + sp.getString("id", ""));
            pwd.setText("你的密码是：" + sp.getString("pwd", ""));
            setTitle("第一题");
        }
        if (getIntent().getType().equals("num2")) {
            setTitle("第二题");
            try {
                byte[] id = new byte[openFileInput("id").available()];
                byte[] pwd = new byte[openFileInput("pwd").available()];
                openFileInput("id").read(id);
                openFileInput("pwd").read(pwd);
                this.id.setText("你的账号是：" + new String(id));
                this.pwd.setText("你的密码是：" + new String(pwd));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}