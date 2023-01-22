package com.example.fashionui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fashionui.databinding.FragmentFirstBinding
import com.example.fashionui.databinding.FragmentSecondBinding
import com.example.fashionui.viewPager.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    private var tabLayoutTitles = arrayListOf<String>("All","Man","Women","Child")


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false);
        val view = binding.root;
        return view;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val adapter = ViewPagerAdapter(parentFragmentManager,lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position->

            tab.text = tabLayoutTitles[position]

        }.attach()

        for (i in 0..3) {
            val textView = LayoutInflater.from(requireContext()). inflate (R.layout.tab_title,  null)
            as TextView
            binding.tabLayout.getTabAt(i)?.customView = textView
        }
    }
}