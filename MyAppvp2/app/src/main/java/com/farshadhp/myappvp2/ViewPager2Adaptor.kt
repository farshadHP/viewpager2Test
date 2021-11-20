package com.farshadhp.myappvp2

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.databinding.ItemVp2Binding
import com.farshadhp.myappvp2.databinding.ItemsInVp2Binding

class ViewPager2Adaptor(

    val images : List<Int>,
    val imageTexts : List<String>
) : RecyclerView.Adapter<ViewPager2Adaptor.RVHolder>(){
    inner class RVHolder(val viewDataBinding: ItemsInVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPager2Adaptor.RVHolder {
        val binding  =  ItemsInVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  RVHolder(binding)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        holder.viewDataBinding.ivImage.setImageResource(images[position])
        Log.e("test","amad inja")
        holder.viewDataBinding.tvText.text = imageTexts[position]

    }

    override fun getItemCount(): Int {
        return  images.size
    }

}
