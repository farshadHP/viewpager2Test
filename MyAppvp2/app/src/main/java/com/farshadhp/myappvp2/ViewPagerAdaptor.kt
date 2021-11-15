package com.farshadhp.myappvp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.databinding.DataBindingUtil
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.databinding.ItemVp2Binding
import java.util.zip.Inflater

class ViewPagerAdaptor(

    val images : List<Int>,
    val imageTexts : List<String>
) : RecyclerView.Adapter<ViewPagerAdaptor.ViewPagerViewHolder>(){
    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    private lateinit var binding: ItemVp2Binding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vp2,parent,false)
        binding = ItemVp2Binding.inflate(LayoutInflater.from(parent.context))
        return  ViewPagerViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        val curImageText = imageTexts[position]
        binding.ivImage.setImageResource(curImage)
        binding.tvText.setText(curImageText)
    }

    override fun getItemCount(): Int {
        return  images.size
    }
}

//binding = DataBindingUtil.setContentView(,R.layout.item_vp2)
//ItemVp2Binding.inflate(LayoutInflater.from())

//val binding = DataBindingUtil.setContentView(,R.layout.item_vp2)