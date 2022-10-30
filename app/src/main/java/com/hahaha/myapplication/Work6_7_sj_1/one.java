package com.hahaha.myapplication.Work6_7_sj_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Button denglu = findViewById(R.id.denglu);
        denglu.setOnClickListener(v -> {
            Intent intent = new Intent(this, two.class);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            assert data != null;
            String name = data.getStringExtra("name");
            setTitle("获取到的名字是：" + name);
        }
    }
}