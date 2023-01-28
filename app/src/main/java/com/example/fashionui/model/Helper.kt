package com.example.fashionui.model

import com.example.fashionui.R

object Helper {

    fun defineDatas(): ArrayList<Product> {
        val a = ArrayList<Product>()

        a.add(Product("burak", R.drawable.a3))
        a.add(Product("selcuk", R.drawable.b2))
        a.add(Product("baba", R.drawable.a7))
        a.add(Product("gaga", R.drawable.b1))
        a.add(Product("tata", R.drawable.a6))
        a.add(Product("haha", R.drawable.b3))
        a.add(Product("caca", R.drawable.a5))

        return a
    }

}