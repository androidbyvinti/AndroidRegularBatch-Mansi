package com.bmpl.gridview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imagesArray  = arrayOf("http://www.uniwallpaper.com/static/images/butterfly-wallpaper.jpeg",
                                "https://www.gettyimages.ie/gi-resources/images/Homepage/Hero/UK/CMS_Creative_164657191_Kingfisher.jpg",
                                "https://img00.deviantart.net/e2e6/i/2012/339/8/a/png_material_by_moonglowlilly-d5n4w1c.png",
                                "https://i.stack.imgur.com/ILTQq.png",
                                "https://orig00.deviantart.net/06cf/f/2013/117/f/a/red_rose_png_1_by_mysticemma-d63699y.png",
                                "http://childhoodkingdom.com/wp-content/uploads/2016/12/SSB4U3D_Pikachu.png",
                                "https://i.imgur.com/EyXjS8r.png",
                                "http://www.pngpix.com/wp-content/uploads/2016/11/PNGPIX-COM-Bugs-Bunny-PNG-Transparent-Image.png")


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