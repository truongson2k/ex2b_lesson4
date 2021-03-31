package com.gmail.exercise2b_bai4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryRecyclerAdapter(
    val context: Context, val countrySource:List<CountryInfo>): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_item_country,parent,false))
    }

    override fun getItemCount(): Int {
        return countrySource.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTV.text = countrySource[position].name
        holder.populationTV.text = countrySource[position].population.toString() + " millions"
        holder.flagIV.setImageResource(countrySource[position].flag)
    }
}
class ViewHolder(view: View): RecyclerView.ViewHolder(view){
    val nameTV = view.findViewById<TextView>(R.id.nameTV)
    val populationTV = view.findViewById<TextView>(R.id.populationTV)
    val flagIV = view.findViewById<ImageView>(R.id.flagIV)
}
