package com.example.exam2512.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.exam2512.R.*
import com.example.exam2512.fragment.FragmentNewsDetail
import com.example.exam2512.models.ModelNews

class AdapterNews(private val array: List<ModelNews>, val context: FragmentActivity) :
    RecyclerView.Adapter<AdapterNews.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val newsTV = view.findViewById<TextView>(id.news_title)
        val newsIV = view.findViewById<ImageView>(id.news_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout.item_news_cell, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]

        Glide
            .with(holder.itemView.context)
            .load(item.imageUrl)
            .into(holder.newsIV)

        holder.newsTV.text = item.name

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("news", item)
            context.supportFragmentManager.beginTransaction()
                .replace(id.container, FragmentNewsDetail::class.java, bundle)
                .addToBackStack(null)
                .commit()
        }

    }

    override fun getItemCount(): Int {
        return array.size
    }

}

