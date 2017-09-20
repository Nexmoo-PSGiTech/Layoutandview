package com.login.aswathibaskaran.cardviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast


class ListItemActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(this@ListItemActivity2,"Used a frame layout", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview2)
    }
}