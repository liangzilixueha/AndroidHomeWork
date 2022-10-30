package com.hahaha.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.hahaha.myapplication.MyReceiver")) {
            Toast.makeText(context, "收到广播", Toast.LENGTH_SHORT).show();
        }
    }
}