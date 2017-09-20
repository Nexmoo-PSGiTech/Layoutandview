package com.login.aswathibaskaran.cardviewexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView


class ListViewItemClickEventExample : AppCompatActivity() {
    internal lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list) as ListView
        val values = arrayOf("Android", "Services in android", "Actitivity", "APK format", "Intent", "Explicit intent", "Implicit intent", "ADT")

        val adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                val myIntent = Intent(view.context, MainActivity::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 1) {
                val myIntent = Intent(view.context, ListItemActivity2::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 2) {
                val myIntent = Intent(view.context, Item3::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 3) {
                val myIntent = Intent(view.context, List4::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 4) {
                val myIntent = Intent(view.context, List5::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 5) {
                val myIntent = Intent(view.context, List6::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 6) {
                val myIntent = Intent(view.context, List7::class.java)
                startActivityForResult(myIntent, 0)
            }

            if (position == 7) {
                val myIntent = Intent(view.context, List8::class.java)
                startActivityForResult(myIntent, 0)
            }
        }
    }
}
