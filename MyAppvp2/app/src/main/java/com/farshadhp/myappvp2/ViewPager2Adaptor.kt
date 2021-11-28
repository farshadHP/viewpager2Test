package com.farshadhp.myappvp2

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.databinding.ItemsInVp2Binding

class ViewPager2Adaptor() : RecyclerView.Adapter<ViewPager2Adaptor.RVHolder>(){
    private var myList = emptyList<Model>()
    
    inner class RVHolder(val viewDataBinding: ItemsInVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPager2Adaptor.RVHolder {
        val binding  =  ItemsInVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  RVHolder(binding)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        holder.viewDataBinding.tvId.text = myList[position].id.toString()
        Log.e("test","amad inja")
        holder.viewDataBinding.tvTitle.text = myList[position].title

    }

    override fun getItemCount(): Int {
        return  myList.size
    }

    fun setData(newList: List<Model>){
        myList = newList
        notifyDataSetChanged()
    }

}
