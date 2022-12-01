package com.hahaha.myapplication.Chapter8;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class Num1_1 extends AppCompatActivity {

    private SharedPreferences sp;
    private EditText id;
    private EditText pwd;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num11);
        setTitle("第一题");
        sp = getSharedPreferences("save", MODE_PRIVATE);
        id = (EditText) findViewById(R.id.id);
        pwd = (EditText) findViewById(R.id.pwd);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(view -> {
            //保存到SharedPreferences
            sp.edit().putString("id", id.getText().toString()).apply();
            sp.edit().putString("pwd", pwd.getText().toString()).apply();
            //前往
            Intent intent = new Intent(Num1_1.this, Num1_2.class);
            intent.setType("num1_1");
            startActivity(intent);
        });
    }
}