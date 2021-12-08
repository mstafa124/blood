package com.example.mostafa.ethaarpro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DB_sql extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public static final String DBname = "datablood.db";

    public DB_sql(Context context) {
        super(context, DBname, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table bloodtable (identity varchar(9) PRIMARY KEY not null,unitnum VARCHAR ,name1 TEXT not null,name2 TEXT,name3 TEXT,name4 TEXT, telephone varchar(7)" +
                ",phone varchar(9),sex TEXT,address TEXT,street TEXT,work TEXT,status TEXT,datedonate DATE,namepatient TEXT,heat VARCHAR(6),weight VARCHAR(6),heart VARCHAR(6)" +
                ",status2 TEXT,pressure VARCHAR(8),diseass TEXT,respons TEXT,rh TEXT,hb TEXT,gdl TEXT,wbc TEXT,rbc TEXT,plt TEXT,namelab TEXT,tech TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS bloodtable");
        onCreate(db);
    }

    public boolean insertdata(DataDoner dataDoner) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("identity", dataDoner.getIdentity());
        contentValues.put("unitnum", dataDoner.getUnitnum());
        contentValues.put("name1", dataDoner.getName1());
        contentValues.put("name2", dataDoner.getName2());
        contentValues.put("name3", dataDoner.getName3());
        contentValues.put("name4", dataDoner.getName4());
        contentValues.put("telephone", dataDoner.getTelephone());
        contentValues.put("phone", dataDoner.getPhone());
        contentValues.put("sex", dataDoner.getSex());
        contentValues.put("address", dataDoner.getAddress());
        contentValues.put("street", dataDoner.getStreet());
        contentValues.put("work", dataDoner.getWork());
        contentValues.put("status", dataDoner.getStatus());
        contentValues.put("datedonate", dataDoner.getDatedonate());
        contentValues.put("namepatient", dataDoner.getNamepatient());
        contentValues.put("heat", dataDoner.getHeat());
        contentValues.put("weight", dataDoner.getWeight());
        contentValues.put("heart", dataDoner.getHeart());
        contentValues.put("status2", dataDoner.getStatus2());
        contentValues.put("pressure", dataDoner.getPressure());
        contentValues.put("diseass", dataDoner.getDiseass());
        contentValues.put("respons", dataDoner.getRespons());
        contentValues.put("rh", dataDoner.getRh());
        contentValues.put("hb", dataDoner.getHb());
        contentValues.put("gdl", dataDoner.getGdl());
        contentValues.put("wbc", dataDoner.getWbc());
        contentValues.put("rbc", dataDoner.getRbc());
        contentValues.put("plt", dataDoner.getPlt());
        contentValues.put("namelab", dataDoner.getNamelab());
        contentValues.put("tech", dataDoner.getTech());

        long result = db.insert("bloodtable", null, contentValues);
        if (result == -1) {
            return false;
        }
        return true;
    }


    public List<DataDoner> getallrecord() {
        List<DataDoner> arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from bloodtable", null);

        if (res.moveToFirst()) {
            do {
                String identity = res.getString(0);
                String unitnum = res.getString(1);
                String name1 = res.getString(2);
                String name2 = res.getString(3);
                String name3 = res.getString(4);
                String name4 = res.getString(5);
                String telephone = res.getString(6);
                String phone = res.getString(7);
                String sex = res.getString(8);
                String address = res.getString(9);
                String street = res.getString(10);
                String work = res.getString(11);
                String status = res.getString(12);
                String datedonate = res.getString(13);
                String namepatient = res.getString(14);
                String heat = res.getString(15);
                String weight = res.getString(16);
                String heart = res.getString(17);
                String status2 = res.getString(18);
                String pressure = res.getString(19);
                String diseass = res.getString(20);
                String response = res.getString(21);
                String rh = res.getString(22);
                String hb = res.getString(23);
                String gdl = res.getString(24);
                String wbc = res.getString(25);
                String rbc = res.getString(26);
                String plt = res.getString(27);
                String namelab = res.getString(28);
                String tech = res.getString(29);
                DataDoner dataDoner = new DataDoner(identity, unitnum, name1, name2, name3, name4, telephone, phone, sex, address, street, work, status,
                        datedonate, namepatient, heat, weight, heart, status2, pressure, diseass, response, rh, hb, gdl, wbc, rbc, plt, namelab, tech);
                arrayList.add(dataDoner);
            } while (res.moveToNext());
        }


//        res.moveToFirst();
//        while (res.isAfterLast()==false){
//            String identity=res.getString(0);
//            String name=res.getString(2);
//            String address=res.getString(3);
//            String phone=res.getString(6);
//            arrayList.add(identity+"-"+name+":"+address);
//            res.moveToNext();
//
//        }
        return arrayList;
    }

    public boolean updatedata(DataDoner dataDoner) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("identity", dataDoner.getIdentity());

        contentValues.put("name1", dataDoner.getName1());

        contentValues.put("phone", dataDoner.getPhone());
        contentValues.put("sex", dataDoner.getSex());
        contentValues.put("address", dataDoner.getAddress());

        contentValues.put("datedonate", dataDoner.getDatedonate());
        contentValues.put("namepatient", dataDoner.getNamepatient());

        db.update("bloodtable", contentValues, "identity=?", new String[]{dataDoner.getIdentity()});
        return true;

    }

    public Integer deletedata(String Identity) {

        SQLiteDatabase db = this.getWritableDatabase();



        return  db.delete("bloodtable", "identity=?", new String[]{Identity});

    }

    public List<DataDoner> searchdata(String identity) {

        List arrayList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("select * from bloodtable where identity like'" + identity + "%'", null);
        if (cur.moveToFirst()) {
            do {
                arrayList.add(cur.getString(cur.getColumnIndex("identity")) + " " + cur.getString(cur.getColumnIndex("name1")));
            } while (cur.moveToNext()); }

//        cur.moveToFirst();
//        while (cur.isAfterLast()==false){
//            arrayList.add(cur.getString(cur.getColumnIndex("identity")) + " " + cur.getString(cur.getColumnIndex("name1")));
//            cur.moveToNext();
//
//        }


        return arrayList;

    }



}
