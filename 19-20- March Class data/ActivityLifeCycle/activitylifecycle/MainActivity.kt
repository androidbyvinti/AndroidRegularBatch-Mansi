package com.bmpl.activitylifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "inside onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "inside onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "inside onPause()")
    }


    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "inside onResume()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "inside onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "inside onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "inside onRestart()")
    }
}
