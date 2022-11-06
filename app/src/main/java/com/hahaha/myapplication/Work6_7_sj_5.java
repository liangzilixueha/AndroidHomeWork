package com.hahaha.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Work6_7_sj_5 extends AppCompatActivity {

    private static final String TAG = "csw";
    public static EditText num1;
    public static EditText num2;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work67_sj5);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction("com.hahaha.myapplcation.MyService2");
            intent.setComponent(new ComponentName("com.hahaha.myapplication",
                    "com.hahaha.myapplication.MyService2"));
            startService(intent);
        });
    }
}