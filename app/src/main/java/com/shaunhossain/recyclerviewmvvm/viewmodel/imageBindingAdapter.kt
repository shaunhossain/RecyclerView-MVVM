package com.shaunhossain.recyclerviewmvvm.viewmodel

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.shaunhossain.recyclerviewmvvm.R
import com.squareup.picasso.Picasso

object imageBindingAdapter {
    @JvmStatic
    @BindingAdapter("android:src")
    fun imageUrl(view: ImageView,url: String){
        Picasso.get()
            .load(url)
            .placeholder(R.drawable.man)
            .resize(100,100)
            .centerCrop()
            .into(view)

    }
}