package com.bmpl.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide


class CustomAdatper(mainActivity: MainActivity, var imagesArray: Array<Int>) : BaseAdapter() {

    //arrayOf() --> predefined method for storing string values in an array
    // String imagesArray[] ={"", ""}

    var context:Context = mainActivity
    var counter = 0

    var layoutInflater : LayoutInflater    // LayoutInflater --> Predefined class -->

    init {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    }


    //main method which handles the view for the gridview
    override fun getView(index: Int, v: View?, viewGroup: ViewGroup?): View {

        val view : View = layoutInflater.inflate(R.layout.images_layout, viewGroup, false)

        var imageViewOne = view.findViewById<ImageView>(R.id.image1)
        var imageViewTwo = view.findViewById<ImageView>(R.id.image2)

        //imageViewOne.setImageResource(imagesArray[index + (index * 1)]) //0 2 4
        //imageViewTwo.setImageResource(imagesArray[index+1]) //1 3 5


            Glide.with(context)
                    .load(imagesArray[index]) //
                    .into(imageViewOne)

            counter++
        if(counter<=index){
                Glide.with(context)
                        .load(imagesArray[index + counter])
                        .into(imageViewTwo)

        }

        return view
    }

    override fun getItem(p0: Int): Any {
        return imagesArray
    }

    override fun getItemId(index: Int): Long {
        return imagesArray[index].toLong()
    }

    override fun getCount(): Int {
        return imagesArray.size
    }
}