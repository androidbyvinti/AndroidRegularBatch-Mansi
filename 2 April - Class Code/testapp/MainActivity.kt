package com.vinti.testapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   private var DELAY_MILLISECONDS = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handler class --> Thread --> postDelayed(Runnable, long delayMilliseconds){}

        var handler = Handler()

        var run = Runnable {
            var intent =  Intent(this, MenuActivity :: class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(run, DELAY_MILLISECONDS)

    }

}
