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
            // step-1: Create an Object of Intent class
            // step-2: pass the source and destination as parameter in Intent Constructor
            // step-3: startActivity() --> no use of intent object
            // Intent --> class
            // Intent() --> constructor
            var intent = Intent(this@MainActivity, SecondActivity :: class.java)   // object created of type Intent
            startActivity(intent)
        }

    }
}