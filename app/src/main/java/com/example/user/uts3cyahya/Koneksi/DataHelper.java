package com.example.user.uts3cyahya.Koneksi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by user on 23/10/2018.
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "instagram.db";
    private static final int DATABASE_VERSION = 1;


    public DataHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table tbl_user (id integer primary key," +
                "email text null, " +
                "nama text null, " +
                "username text null, " +
                "password text null);";
        Log.d("Data","onCreate : "+sql);
        db.execSQL(sql);

        sql = "INSERT INTO tbl_user(email,nama,username,password)" +
                "VALUES ('yahuya@gmail.com','Yahya Pradika', 'yahuya','qwerty');";
//        sql = "INSERT INTO tbl_user (nama,username,password) " +
//                "VALUES ('Yahya Pradika','yahuya','password');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
