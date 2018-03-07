package com.bmpl.switchactivities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler --> Predefined class --> delay

        // handler object
        var handler = Handler()

        // Runnable --> Predefined Interface
        var runnable =  Runnable {

            // data to be executed when time limit exceeds
            var intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
            finish()    // stop adding the current screen into Stack
        }

        handler.postDelayed(runnable, 3000)
        //button.setOnClickListener{}
    }
}