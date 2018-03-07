package com.bmpl.implicitintent

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener {

            //step - 1: Create object of Intent class
            // implicit intent --> data --> type of data and action --> action to perform on that data
            // longitude --> 23.89898 --> lattitude --> 78.43434--> outside the application -->Implicit Intent

            var intent = Intent()   // empty brackets
            // data -- text, images, music files
            intent.type = "text/plain"
            intent.action = Intent.ACTION_SEND
            //predefined method --> Intent class
                    // putExtra(String key, value)
            intent.putExtra(Intent.EXTRA_TEXT, "This is my data") // message -->
                            // Universal Key -->
            startActivity(Intent.createChooser(intent,"Select any one" ))

        }
    }
}
