package com.example.lesson44

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.horizontal_item.view.*

class InnerAdapter : RecyclerView.Adapter<InnerAdapter.InnerViewHolder>() {

    inner class InnerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun populateApp(app: App) {
            itemView.appImageID.setImageResource(app.image)
            itemView.appDescriptionID.text = app.information
        }
    }

    var horizontalApps: List<App> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerViewHolder {
        val horizontalView = LayoutInflater.from(parent.context).inflate(R.layout.horizontal_item, parent, false)
        return InnerViewHolder(horizontalView)
    }

    override fun onBindViewHolder(holder: InnerViewHolder, position: Int) {
        holder.populateApp(horizontalApps[position])
    }

    override fun getItemCount(): Int {
        return horizontalApps.size
    }
}