package com.hahaha.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Work6_7_sj_3 extends AppCompatActivity {

    private TextView textView;
    private Button start;
    private Button stop;
    private Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (!flag)
                    continue;
                Message message = new Message();
                message.what = 1;
                handler.sendMessage(message);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    private static final String TAG = "csw";
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 1) {
                //获取当前的时间
                long time = System.currentTimeMillis();
                //将时间转换为字符串
                String str = String.valueOf(time);
                textView.setText(textView.getText().toString() + str + "\n");
            }
            if (message.what == 2) {
                textView.setText(textView.getText().toString() + "暂停了" + "\n");
            }
            return false;
        }
    });
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work67_sj3);
        textView = (TextView) findViewById(R.id.textView);
        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        thread.start();
        start.setOnClickListener(v -> {
            flag = true;
        });
        stop.setOnClickListener(v -> {
            Message message = new Message();
            message.what = 2;
            handler.sendMessage(message);
            flag = false;
        });
    }
}