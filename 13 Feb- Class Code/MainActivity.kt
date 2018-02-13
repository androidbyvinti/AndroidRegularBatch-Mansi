package com.bmpl.imageswitch

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton1.setOnClickListener {
            resultImageView.setImageResource(R.drawable.image2)
        }

        imageButton2.setOnClickListener {
            resultImageView.setImageResource(R.drawable.image3)
        }
    }
}
