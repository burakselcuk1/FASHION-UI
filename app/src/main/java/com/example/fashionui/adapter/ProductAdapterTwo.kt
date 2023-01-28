package com.example.fashionui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fashionui.databinding.ProductitemBinding
import com.example.fashionui.model.Product


class ProductAdapterTwo(private val dataSet: ArrayList<Product>) :
    RecyclerView.Adapter<ProductAdapterTwo.ViewHolder>() {
    private lateinit var binding: ProductitemBinding

    class ViewHolder(view: ProductitemBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        binding = ProductitemBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {


        binding.productInformation = dataSet.get(position)

    }
    override fun getItemCount() = dataSet.size

}