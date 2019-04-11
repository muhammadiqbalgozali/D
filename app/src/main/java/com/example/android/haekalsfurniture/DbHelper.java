package com.example.android.haekalsfurniture;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Pembuatan database
 */

public class DbHelper extends SQLiteOpenHelper {

    //pendeklarasian variabel dengan tipe data int
    private static final int  DATABASE_VERSION =1;
    //pendeklarasian variabel dengan tipe data String serta isi string sesuai text dibawah.
    private static final String DATABASE_NAME ="StockDb";
    private static final String TABLE_NAME = "stockbarang";
    private static final String TABLE_STOCK = "stock_barang";
    private static final String COLUMN_1 = "stock1";
    private static final String COLUMN_2 = "stock2";
    private static final String COLUMN_3 = "stock3";
    private static final String COLUMN_4 = "stock4";
    private static final String COLUMN_5 = "stock5";
    private static final String COLUMN_6 = "stock6";
    private static final String COLUMN_7 = "stock7";
    private static final String COLUMN_8 = "stock8";
    private static final String COLUMN_9 = "stock19";
    private static final String COLUMN_10 = "stock10";
    private static final String COLUMN_11= "stock11";
    private static final String COLUMN_12 = "stock12";
    private static final String COLUMN_13 = "stock13";
    private static final String COLUMN_14 = "stock14";
    private static final String COLUMN_15 = "stock15";

    //Pembuatan class DbHelper agar Nama DbHelper tidak digunakan oleh class lain nya.
    public DbHelper(Context context){
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    //Pembuatan database menggunakan SQLite
    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_STOCK_TABLE = "CREATE TABLE stock_barang ("+
                "stock1 INTEGER,"+
                "stock2 INTEGER,"+
                "stock3 INTEGER,"+
                "stock4 INTEGER,"+
                "stock5 INTEGER,"+
                "stock6 INTEGER,"+
                "stock7 INTEGER,"+
                "stock8 INTEGER,"+
                "stock9 INTEGER,"+
                "stock10 INTEGER,"+
                "stock11 INTEGER,"+
                "stock12 INTEGER,"+
                "stock13INTEGER,"+
                "stock14 INTEGER,"+
                "stock15 INTEGER)";

        db.execSQL(CREATE_STOCK_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /** Pembuatan database untuk update data stock 1 - 15**/
    public void addStock1(int stock1){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_1, stock1);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }

    public void addStock2(int stock2){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_2, stock2);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }

    public void addStock3(int stock3){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_3, stock3);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }

    public void addStock4(int stock4){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_4, stock4);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock5(int stock5){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_5, stock5);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock6(int stock6){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_6, stock6);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock7(int stock7){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_7, stock7);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock8(int stock8){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_8, stock8);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock9(int stock9){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_9, stock9);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock10(int stock10){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_10, stock10);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock11(int stock11){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_11, stock11);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock12(int stock12){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_12, stock12);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock13(int stock13){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_13, stock13);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock14(int stock14){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_14, stock14);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }
    public void addStock15(int stock15){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_15, stock15);
        db.insert(TABLE_STOCK,
                null,
                values);
        db.close();
    }


}
