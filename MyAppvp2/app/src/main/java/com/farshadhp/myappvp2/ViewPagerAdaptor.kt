package com.farshadhp.myappvp2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.databinding.ItemVp2Binding

class ViewPagerAdaptor(

    val images : List<Int>,
    val imageTexts : List<String>
) : RecyclerView.Adapter<ViewPagerAdaptor.ViewPagerViewHolder>(){
    inner class ViewPagerViewHolder(val viewDataBinding: ItemVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdaptor.ViewPagerViewHolder {
        val binding  =  ItemVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewPagerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.viewDataBinding.ivImage.setImageResource(images[position])
        holder.viewDataBinding.tvText.text = imageTexts[position]

    }

    override fun getItemCount(): Int {
        return  images.size
    }
}
