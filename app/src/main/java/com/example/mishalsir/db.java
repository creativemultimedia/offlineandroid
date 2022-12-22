package com.example.mishalsir;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class db extends SQLiteOpenHelper {
    public db(@Nullable Context context) {
        super(context, "register", null,1);
    }

    //first time install
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String q="create table student (id integer primary key,name text,contact text)";
        sqLiteDatabase.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    void insert(String name,String contact)
    {
        String q="insert into student values(null,'"+name+"','"+contact+"')";
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.execSQL(q);
    }
}
