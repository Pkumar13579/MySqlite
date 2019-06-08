package com.example.iteradmin.mysqlite

import android.content.Context
import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val database = openOrCreateDatabase("database",Context.MODE_PRIVATE,null)

        database.execSQL("create table if not exists student(id number, name varchar, marks number)")

        database.rawQuery("insert into student values(1,'siddharth',100)",null)
        database.rawQuery("insert into student values(2,'vijay',102)",null)
        database.rawQuery("insert into student values(3,'priyanka',56)",null)

        val cursor:Cursor =database.rawQuery("select * from student",null)

        Toast.makeText(this,"Column count "+cursor.columnCount,Toast.LENGTH_LONG).show()
        Toast.makeText(this,"column name "+cursor.getColumnName(1),Toast.LENGTH_LONG).show()
        Toast.makeText(this,"row count "+cursor.count,Toast.LENGTH_LONG).show()
        Toast.makeText(this,"column names "+cursor.columnNames[1],Toast.LENGTH_LONG).show()
        Toast.makeText(this,"position "+cursor.position,Toast.LENGTH_LONG).show()
        Toast.makeText(this,"Index "+cursor.getColumnIndex("name"),Toast.LENGTH_LONG).show()
*/

        val database = DBHelper(this)
        val im: Long = database.insert(1,"piyush",199)
        val s:String = "data id"+im
        Toast.makeText(this,s,Toast.LENGTH_LONG).show()
    }
}
