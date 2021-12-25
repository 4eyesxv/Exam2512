package com.example.exam2512.fragment

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.exam2512.R
import com.example.exam2512.models.Categories
import com.example.exam2512.models.ModelNews


class FragmentNewsDetail : Fragment() {

    private lateinit var news: ModelNews

    private lateinit var newsTitleTV: TextView
    private lateinit var newsDescriptionTV: TextView
    private lateinit var newsIV: ImageView
    private lateinit var newsContainer: ConstraintLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        news = arguments?.getSerializable("news") as ModelNews
        val view = inflater.inflate(R.layout.fragment_detail_news_cell, container, false)

        newsTitleTV = view.findViewById(R.id.news_detail_title)
        newsDescriptionTV = view.findViewById(R.id.news_detail_description)
        newsIV = view.findViewById(R.id.news_detail_image)
        newsContainer = view.findViewById(R.id.news_detail_container)

        newsTitleTV.text = news.name
        newsDescriptionTV.text = news.description

        Glide.with(requireContext()).load(news.imageUrl).into(newsIV)

        when(news.category){
            Categories.Business -> newsContainer.background = ColorDrawable(ContextCompat.getColor(requireContext(), R.color.purple_200))
            Categories.Sport -> newsContainer.background = ColorDrawable(ContextCompat.getColor(requireContext(), R.color.red))
            Categories.Culture -> newsContainer.background = ColorDrawable(ContextCompat.getColor(requireContext(), R.color.blue))
            Categories.Political -> newsContainer.background = ColorDrawable(ContextCompat.getColor(requireContext(), R.color.orange))
        }

        return view
    }

}