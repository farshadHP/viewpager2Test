package com.farshadhp.myappvp2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.databinding.ItemVp2Binding

class RecyclerViewAdaptor(

    val images : List<Int>,
    val imageTexts : List<String>
) : RecyclerView.Adapter<RecyclerViewAdaptor.RVHolder>(){
    inner class RVHolder(val viewDataBinding: ItemVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdaptor.RVHolder {
        val binding  =  ItemVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  RVHolder(binding)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        holder.viewDataBinding.ivImage.setImageResource(images[position])
        holder.viewDataBinding.tvText.text = imageTexts[position]

    }

    override fun getItemCount(): Int {
        return  images.size
    }
}
