package com.hahaha.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService2 extends Service {
    private static final String TAG = "csw";

    public MyService2() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        String string = Work6_7_sj_5.num1.getText().toString();
        //把字符串转换成整型
        int num1 = Integer.parseInt(string);
        String string2 = Work6_7_sj_5.num2.getText().toString();
        //把字符串转换成整型
        int num2 = Integer.parseInt(string2);
        Toast.makeText(this, (num1 > num2 ? num1 : num2) +" ", Toast.LENGTH_LONG).show();
        super.onCreate();
    }
}