package com.hahaha.myapplication.Work6_7_sj_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button sure = findViewById(R.id.button_sure);
        Button cancel = findViewById(R.id.button_cancel);
        EditText editText=findViewById(R.id.editText);

        cancel.setOnClickListener(v -> {
            //返回"name","null"
            Intent intent = new Intent();
            intent.putExtra("name", "null");
            setResult(RESULT_CANCELED, intent);
            finish();
        });
        sure.setOnClickListener(v -> {
            //返回"name","hahaha"
            Intent intent = new Intent();
            intent.putExtra("name",editText.getText()+"");
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}