package com.bmpl.gridview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imagesArray = arrayOf(R.string.imageOne, R.string.imageTwo,
            R.string.imageThree, R.string.imageFour,
            R.string.imageFive, R.string.imageSix,
            R.string.imageSeven, R.string.imageEight)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Glide.with(this)
//                .load("http://www.uniwallpaper.com/static/images/butterfly-wallpaper.jpeg")
//                .into(imageView)

        //var arrayAdapter = ArrayAdapter()


        var arrayAdatper = CustomAdatper(this, imagesArray)

        gridView.adapter = arrayAdatper

    }
}