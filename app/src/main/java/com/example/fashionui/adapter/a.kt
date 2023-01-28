package com.example.fashionui.adapter

import android.graphics.drawable.Drawable
import android.widget.ImageView

import androidx.databinding.BindingAdapter


@BindingAdapter("app:svg")
fun setImageViewResource(imageView: ImageView, resource: Int) {
    imageView.setImageResource(resource)
}