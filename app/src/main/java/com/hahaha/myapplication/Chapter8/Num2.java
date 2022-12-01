package com.hahaha.myapplication.Chapter8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class Num2 extends AppCompatActivity {

    private EditText id;
    private EditText pwd;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //由于布局一样，只是实现的功能不一样，所以我们可以直接复用布局
        setContentView(R.layout.activity_num11);
        id = (EditText) findViewById(R.id.id);
        pwd = (EditText) findViewById(R.id.pwd);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(view -> {
            //采用openFileOutput()方法，将数据保存到文件中
            try {
                //保存到文件
                openFileOutput("id", MODE_PRIVATE).write(id.getText().toString().getBytes());
                openFileOutput("pwd", MODE_PRIVATE).write(pwd.getText().toString().getBytes());
                //前往
                //由于布局一样，只是实现的功能不一样，所以我们可以直接复用布局
                //同时为了区分num1_1和num2，我们将添加一个标志
                Intent intent = new Intent(Num2.this, Num1_2.class).setType("num2");
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}