package com.example.fashionui.viewPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.fashionui.R
import com.example.fashionui.adapter.ProductAdapter
import com.example.fashionui.adapter.ProductAdapterTwo
import com.example.fashionui.databinding.FragmentAllBinding
import com.example.fashionui.databinding.FragmentFirstBinding
import com.example.fashionui.model.Helper


class AllFragment : Fragment() {

    private var _binding: FragmentAllBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ProductAdapterTwo


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentAllBinding.inflate(inflater,container,false);
        val view = binding.root;
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ProductAdapterTwo(Helper.defineDatas())
        binding.recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.adapter = adapter

    }

}