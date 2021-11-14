package com.farshadhp.myappvp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_vp2.view.*

class ViewPagerAdaptor(
    val images : List<Int>,
    val imageTexts : List<String>
) : RecyclerView.Adapter<ViewPagerAdaptor.ViewPagerViewHolder>(){
    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vp2,parent,false)
        return  ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        val curImageText = imageTexts[position]
        holder.itemView.ivImage.setImageResource(curImage)
        holder.itemView.tvText.setText(curImageText)
    }

    override fun getItemCount(): Int {
        return  images.size
    }
}