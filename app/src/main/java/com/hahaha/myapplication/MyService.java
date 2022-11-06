package com.hahaha.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private static final String TAG = "csw";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
        //改变Work6_7_sj_4中的textView的内容
        Work6_7_sj_4.change();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}