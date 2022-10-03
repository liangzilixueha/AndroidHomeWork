package com.hahaha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class Work521 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work521);
    }
    //获取屏幕点击事件，输出坐标
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            float x = event.getX();
            float y = event.getY();
            String str = "当前坐标为：(" + x + "," + y + ")";
            Toast.makeText(Work521.this, str, Toast.LENGTH_SHORT).show();
        }
        return super.onTouchEvent(event);
    }
}