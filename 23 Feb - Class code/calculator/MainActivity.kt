package com.bmpl.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var first = 0
    var second = 0
    var operation = "" // *

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Listener attach -->

        // id.onclicklistener
    // another way of attaching listener --> easiest way for attaching listener

    }
        //View class
    // fun print(value : Int)
    fun buttonClicked(view: View){
                        // downcast  // "54+" -->54+89 --> NumberFormatException
            var button = findViewById<Button>(view.id)
            resultTextView.text = resultTextView.text.toString() + button.text
                                            // kotlin --> 5(0)4(1)+(2)8(3)9(4) --> 54+89--> 5
            resultTextView.text.toString().substringAfterLast(operation)

    }

    fun operationRequested(view: View){
        // +
        first = resultTextView.text.toString().toInt() // first = 54
        //54+
        //buttonClicked(view)
        var button = findViewById<Button>(view.id) //8 -id // generic 9
        operation = button.text.toString() // operation  +
        resultTextView.text = resultTextView.text.toString() + button.text //8964355
    }
}