package com.alex.androidjetpack.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alex.androidjetpack.R

class MainActivity : AppCompatActivity() {
    val TAG:String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}

