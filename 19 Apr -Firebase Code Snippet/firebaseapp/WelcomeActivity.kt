package com.bmpl.firebaseapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var data = intent

        var name = data.getStringExtra("name")
    }
}
