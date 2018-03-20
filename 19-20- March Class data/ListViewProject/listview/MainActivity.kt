package com.bmpl.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var values = arrayOf("Data 1", "Data 2", "Data 3", "Data 4",
            "Data 5", "Data 6", "Data 7", "Data 8",
            "Data 9", "Data 10", "Data 11", "Data 12",
            "Data 13", "Data 14", "Data 15", "Data 16")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayAdatper = ArrayAdapter(this,
                R.layout.support_simple_spinner_dropdown_item, values)

        listView.adapter = arrayAdatper

    }
}