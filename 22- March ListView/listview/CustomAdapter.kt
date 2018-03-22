package com.bmpl.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

// Adapter
class CustomAdapter(mainActivity: MainActivity, profileName: Array<String>, profilePic: Array<Int>) : BaseAdapter(){

    var context : Context = mainActivity

    var layoutInflater: LayoutInflater
    var profileName : Array<String> = profileName
    var profilePic : Array<Int> = profilePic

    init {

        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(index: Int, p1: View?, viewGroup: ViewGroup?): View {

        var customView : View = layoutInflater.inflate(R.layout.adapter_custom, viewGroup, false)
        var profileImageView = customView.findViewById<ImageView>(R.id.imageView)
        var profileNameTextView = customView.findViewById<TextView>(R.id.textView)

        profileImageView.setImageResource(profilePic[index])
        profileNameTextView.text = profileName[index]

        return customView

    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return profilePic[p0].toLong()
    }

    override fun getCount(): Int {
        return profileName.size
    }

}