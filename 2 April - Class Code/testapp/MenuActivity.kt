package com.vinti.testapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    val KEY_NAME = "userchoice"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun buttonClicked(view: View){
        var intent = Intent(this, QuizActivity :: class.java)

        var linearLayout = findViewById<LinearLayout>(view.id)

        when(linearLayout.id)
        {
            cButton.id->intent.putExtra(KEY_NAME, "c")
            cPlusButton.id->intent.putExtra(KEY_NAME, "c++")
            javaButton.id->intent.putExtra(KEY_NAME, "java")
            androidButton.id->intent.putExtra(KEY_NAME, "android")
            kotlinButton.id->intent.putExtra(KEY_NAME, "kotlin")
            pythonButton.id->intent.putExtra(KEY_NAME, "python")
        }
        startActivity(intent)
    }
}