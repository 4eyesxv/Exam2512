package com.example.exam2512.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.exam2512.R
import com.example.exam2512.adapters.AdapterNews
import com.example.exam2512.models.ModelCategory

class FragmentNews : Fragment() {
    private lateinit var newsRecyclerView: RecyclerView
    private lateinit var currentCategory: ModelCategory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news_cell, container, false)
        newsRecyclerView = view.findViewById(R.id.news_recyclerview)
        currentCategory = arguments?.getSerializable("category") as ModelCategory

        val newsAdapter = AdapterNews(currentCategory.news, requireActivity())
        newsRecyclerView.adapter = newsAdapter
        return view
    }


}