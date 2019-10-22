package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {

    public DB(@Nullable Context context) {
        super(context,"Demo",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists SinhVien(id int primary key,name nvarchar(50))");
    }

    public void  addSV(SinhVien sv){
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
        ContentValues ctv=new ContentValues();
        ctv.put("id",sv.getId());;
        ctv.put("name",sv.getName());
        sqLiteDatabase.insert("SinhVien",null,ctv);
        sqLiteDatabase.close();
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
