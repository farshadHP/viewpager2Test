package com.farshadhp.myappvp2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.Model.Model

import com.farshadhp.myappvp2.databinding.ItemVp2Binding

class RecyclerViewAdaptor(private var v: Activity) : RecyclerView.Adapter<RecyclerViewAdaptor.RVHolder>(){
    private var myList = emptyList<Model>()

    inner class RVHolder(val viewDataBinding: ItemVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdaptor.RVHolder {
        val binding  =  ItemVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  RVHolder(binding)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        val adapter = ViewPager2Adaptor(v)
        holder.viewDataBinding.vp.adapter = adapter
        adapter.setData(myList)
    }

    override fun getItemCount(): Int {
        return  1
    }

    fun setData(newList: List<Model>){
        myList = newList
        notifyDataSetChanged()
    }

}
