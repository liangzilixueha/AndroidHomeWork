package com.hahaha.myapplication.Work6_7_sj_4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "csw";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.e(TAG, "onBind: " );
        throw new UnsupportedOperationException("Not yet implemented");
    }
}