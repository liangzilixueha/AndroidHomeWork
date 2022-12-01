package com.hahaha.myapplication.Chapter8;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

//数据库
//安卓api版本在26以上的可以在app inspection中快速查看数据库
public class Num5 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num5);
        setTitle("数据库");
        //删除数据库
        deleteDatabase("user.db");
        datebase db = new datebase(this, "user.db", null, 1);
        db.deleteAll();
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(v -> {

            db.insert("Tom", 1, "computer", 5400);
            db.insert("Einstein", 1, "computer", 4800);
            db.insert("Lily", 0, "1.68", 5000);
            db.insert("Warner", 0);
            db.insert("Napoleon", 1);
        });
        button2.setOnClickListener(v -> {
            db.delete("Tom");
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            //修改所有的salary为0
            db.update("update user set salary = 999");
        });
    }
}