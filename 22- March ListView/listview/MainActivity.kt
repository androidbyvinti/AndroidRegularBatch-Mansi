package com.bmpl.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var profileName = arrayOf("Data 1", "Data 2", "Data 3", "Data 4",
                                "Data 5", "Data 6", "Data 7", "Data 8",
                                "Data 9", "Data 10", "Data 11", "Data 12",
                                "Data 13", "Data 14", "Data 15", "Data 16")

    var profilePic  = arrayOf(R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic,R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var arrayAdatper = ArrayAdapter(this,
//                R.layout.custom_list_item, values)

        //listView.adapter = arrayAdatper
        // listener

        // onClickListener

        // onItemClickListener --> index

        listView.adapter = CustomAdapter(this, profileName, profilePic)

        listView.setOnItemClickListener { adapterView, view, index, l ->
            Toast.makeText(this, "You clicked on ${profileName[index]}", Toast.LENGTH_LONG).show()
        }
    }
}