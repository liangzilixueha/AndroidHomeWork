package com.hahaha.myapplication.Chapter8;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class datebase extends SQLiteOpenHelper {
    public datebase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public datebase(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    public datebase(@Nullable Context context, @Nullable String name, int version, @NonNull SQLiteDatabase.OpenParams openParams) {
        super(context, name, version, openParams);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table if not exists user(id integer primary key autoincrement, name varchar(20), sex boolean, department varchar(20), salary double)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insert(String name, int sex, String department, double salary) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("insert into user(name, sex,department,salary) values(?,?,?,?)", new Object[]{name, sex, department, salary});
        db.close();
    }
    public void insert(String name, int sex) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("insert into user(name, sex,department,salary) values(?,?,?,?)", new Object[]{name, sex});
        db.close();
    }

    public void delete(String name) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("delete from user where name = ?", new Object[]{name});
        db.close();
    }

    //打开
    public void open() {
        SQLiteDatabase db = getWritableDatabase();
    }

    public void close() {
        SQLiteDatabase db = getWritableDatabase();
        db.close();
    }

    public void deleteAll() {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("delete from user");
        db.close();
    }

    public void update(String s) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(s);
        db.close();
    }
}
