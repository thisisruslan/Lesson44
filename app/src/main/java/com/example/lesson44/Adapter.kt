package com.example.lesson44

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.vertical_item.view.*

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var innerAdapter = InnerAdapter()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun populateModel(horizontalItems: List<App>) {
            itemView.recyclerAppID.adapter = innerAdapter
            innerAdapter.horizontalApps = horizontalItems
        }
    }

    var verticalItems: List<List<App>> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val verticalView = LayoutInflater.from(parent.context).inflate(R.layout.vertical_item, parent, false)
        return ViewHolder(verticalView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.populateModel(verticalItems[position])
    }

    override fun getItemCount(): Int {
        return verticalItems.size
    }
}