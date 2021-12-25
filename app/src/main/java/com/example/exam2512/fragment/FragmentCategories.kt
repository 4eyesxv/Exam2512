package com.example.exam2512.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.exam2512.R
import com.example.exam2512.adapters.CatAdapter
import com.example.exam2512.models.Constants

class FragmentCategories : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category_cell, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.category_recyclerview)
        recyclerView.adapter = CatAdapter(Constants.categories, requireActivity())
        return view
    }


}


