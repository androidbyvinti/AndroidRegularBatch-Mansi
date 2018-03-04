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

        // clear --> clear all or clear single number-->
        // LongClick--> All clear or
        // normal click--> single digit clear

        clearButton.setOnClickListener {
            //  43-->1
            resultTextView.text = resultTextView.text.dropLast(1)
        }
        clearButton.setOnLongClickListener {
            resultTextView.text = ""
            finalTextView.text = ""
            first = 0
            second = 0
            return@setOnLongClickListener true
        }
    }

    fun buttonClicked(view: View){
            var button = findViewById<Button>(view.id)
            resultTextView.text = resultTextView.text.toString() + button.text

        if(operation.isNotBlank()) {
            second = resultTextView.text.toString().substringAfterLast(operation).toInt() //8964355

            finalTextView.text = when (operation) {
                "+" -> (first + second).toString()
                "-" -> (first - second).toString()
                "X" -> (first * second).toString()
                "/" -> (first / second).toString()
                else -> ""
            }
            first = finalTextView.text.toString().toInt()
        }
    }

    fun operationRequested(view: View){
//56+
        if(operation == "")
            first = resultTextView.text.toString().toInt() // first = 54

        var operationButton = findViewById<Button>(view.id) //8 -id // generic 9
        operation = operationButton.text.toString() // operation  X

        resultTextView.text = resultTextView.text.toString().plus(operation)
    }
}