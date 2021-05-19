package com.example.android.pocapp.home.adpaters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.pocapp.R
import com.example.android.pocapp.home.models.Guide

class HomeAdapter(var data: ArrayList<Guide>) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){

    class HomeViewHolder(view: View): RecyclerView.ViewHolder(view){
        var name = view.findViewById<TextView>(R.id.name)
        var state = view.findViewById<TextView>(R.id.state)
        var city = view.findViewById<TextView>(R.id.city)
        var endDate = view.findViewById<TextView>(R.id.end_date)
        var icon = view.findViewById<ImageView>(R.id.icon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.guide_container, parent, false)

        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val guide = data[position]
        holder.city.text = "City: ${guide.city}"
        holder.name.text = "Name: ${guide.name}"
        holder.state.text = "State: ${guide.state}"
        holder.endDate.text = "End Date: ${guide.endDate}"
        Glide.with(holder.icon).load(guide.icon).into(holder.icon)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}