package com.login.aswathibaskaran.cardviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class Item3: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(this@Item3,"Used a relative layout", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview3)
    }
}