package com.bmpl.gridview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class CustomAdatper : BaseAdapter() {

    //arrayOf() --> predefined method for storing string values in an array
    // String imagesArray[] ={"", ""}

    lateinit var layoutInflater : LayoutInflater    // LayoutInflater --> Predefined class -->

    init {
        //layoutInflater = LayoutInflater.from(this).inflate()
    }

    var imagesArray = arrayOf(R.string.imageOne, R.string.imageTwo,
                                R.string.imageThree, R.string.imageFour,
                                R.string.imageFive, R.string.imageSix,
                                R.string.imageSeven, R.string.imageEight)

    //main method which handles the view for the gridview
    override fun getView(index: Int, view: View?, viewGroup: ViewGroup?): View {

        return view!!
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