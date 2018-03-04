package com.bmpl.switchactivities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton.setOnClickListener {

            // intent object
            // Intent intent = new Intent();
            // whenever an object is created a constructor is invoked
            // source --> destination
            var intent = Intent(this@MainActivity, SecondActivity :: class.java)   // object created of type Intent
            startActivity(intent)
        }

    }
}