package com.hahaha.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.FileDescriptor;

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
        IBinder iBinder = new LocalBinder();
        return iBinder;
    }

    private class LocalBinder implements IBinder {
        @Nullable
        @Override
        public String getInterfaceDescriptor() throws RemoteException {
            return null;
        }

        @Override
        public boolean pingBinder() {
            return false;
        }

        @Override
        public boolean isBinderAlive() {
            return false;
        }

        @Nullable
        @Override
        public IInterface queryLocalInterface(@NonNull String s) {
            return null;
        }

        @Override
        public void dump(@NonNull FileDescriptor fileDescriptor, @Nullable String[] strings) throws RemoteException {

        }

        @Override
        public void dumpAsync(@NonNull FileDescriptor fileDescriptor, @Nullable String[] strings) throws RemoteException {

        }

        @Override
        public boolean transact(int i, @NonNull Parcel parcel, @Nullable Parcel parcel1, int i1) throws RemoteException {
            return false;
        }

        @Override
        public void linkToDeath(@NonNull DeathRecipient deathRecipient, int i) throws RemoteException {

        }

        @Override
        public boolean unlinkToDeath(@NonNull DeathRecipient deathRecipient, int i) {
            return false;
        }
    }
}