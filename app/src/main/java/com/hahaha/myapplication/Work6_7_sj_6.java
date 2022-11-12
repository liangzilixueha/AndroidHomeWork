package com.hahaha.myapplication;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/*
 * 有三个文件
 * 1. MyService3.java
 * 2. Work6_7_sj_6.java
 * 3. aidl/ImyAidlInterface.java
 * 记得添加了aidl文件后要Build->Rebuild Project一下
 */
public class Work6_7_sj_6 extends AppCompatActivity {

    private IMyAidlInterface myService;
    private TextView textView;
    boolean flag = true;
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            myService = IMyAidlInterface.Stub.asInterface(iBinder);
            flag = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            myService = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work67_sj6);
        textView = (TextView) findViewById(R.id.textview);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Work6_7_sj_6.this, MyService3.class);
                bindService(intent, conn, Context.BIND_AUTO_CREATE);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unbindService(conn);
                flag= false;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (flag) {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            try {
                                long time = myService.nowTime() % 100000;
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        textView.setText(time + "");
                                    }
                                });
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}
