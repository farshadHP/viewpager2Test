package com.farshadhp.myappvp2

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.databinding.ItemVp2Binding

class RecyclerViewAdaptor(

    val images : List<List<Int>>,
    val imageTexts : List<List<String>>
) : RecyclerView.Adapter<RecyclerViewAdaptor.RVHolder>(){
    inner class RVHolder(val viewDataBinding: ItemVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdaptor.RVHolder {
        val binding  =  ItemVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  RVHolder(binding)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        //holder.viewDataBinding.ivImage.setImageResource(images[position])
        //Log.e("test","amad inja")
        //holder.viewDataBinding.tvText.text = imageTexts[position]
        val adapter = ViewPager2Adaptor(images[position],imageTexts[position])
        holder.viewDataBinding.vp.adapter = adapter

    }

    override fun getItemCount(): Int {
        return  images.size
    }

}
