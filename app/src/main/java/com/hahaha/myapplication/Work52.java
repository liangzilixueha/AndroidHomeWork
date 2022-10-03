package com.hahaha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Work52 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work52);
        TextView school = findViewById(R.id.school);
        //找到radioGroup，设置监听器
        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //根据id判断选中的是哪个单选按钮
                switch (checkedId){
                    case R.id.radioButton:
                        school.setText("浙江大学");
                        break;
                    case R.id.radioButton2:
                        school.setText("杭州电子科技大学");
                        break;
                    case R.id.radioButton3:
                        school.setText("浙江工业大学");
                        break;
                }
            }
        });
    }
}