package com.bmpl.android.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//#include<stdio.h> --> header files

// : --> inheritance
class MainActivity : AppCompatActivity(){

    //Activity LifeCycle
    // fun print(value : int){ ... }
    // void print(int value){
    //}
    // override --> this method is already created in parent class
    // to customize or to add your own extra features

    // lateinit --> late initialization
    var value = Int  //datatype --> Int // Double

    val value1 = 32 // fixed value cannot be changed

    var value2 = 90 // value can be changed

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// super --> parent
        setContentView(R.layout.activity_main)  // predefined method --> for binding front-end file with back-end
        // R --> Predefined class in android --> always created for every new project
        // all the resource id's -->
        //layout-->
        // activity_main

        //Step-1: Downcasting
        value2 = 54
        //value1 = 32


        // return huge size but you are reducing that size acc. to your requirement
        var checkButton = findViewById<Button>(R.id.checkResultButton)
        var firstEditText = findViewById<EditText>(R.id.firstEditText)
        var secondEditText = findViewById<EditText>(R.id.secondEditText)

        //step-2: Attach Listener
        //onClickListener
        //step-3: Attach Handler
                                        //lambda functions
        checkButton.setOnClickListener {

            var value = 10// Int
            var name = "Ram" // String

            var first : Int = firstEditText.text.toString().toInt()
            var second : Int = secondEditText.text.toString().toInt()
            var sum = first + second
            // Toast --> Predefined class

            Toast.makeText(this, "Sum is $sum", Toast.LENGTH_LONG).show()// show()-> it will appear on screen otherwise not

        }

        //step-1: Downcast  // not mandatory
        //step-2: Attach Listener
        //step-3: Attach Handler
    }

   //fun print()// defination define keyword abstract
}