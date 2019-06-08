package com.example.iteradmin.mysqlite

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context):SQLiteOpenHelper(context,"database",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("create table student(id number,name varchar,marks number)",null)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL("drop table if exists student")
        onCreate(p0)
    }
    fun insert(id:Int,name: String,marks:Int):Long{
        val mydb = this.writableDatabase
        val values = ContentValues()
        values.apply {
            put("id",id)
            put("name",name)
            put("marks",marks)
        }
        val rowId:Long = mydb.insert("student",null,values)
        return rowId
    }


}