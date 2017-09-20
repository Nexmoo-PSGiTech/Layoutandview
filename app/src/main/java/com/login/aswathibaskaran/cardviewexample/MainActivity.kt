package com.login.aswathibaskaran.cardviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this@MainActivity,"Used a frame layout", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_listview)
    }
}