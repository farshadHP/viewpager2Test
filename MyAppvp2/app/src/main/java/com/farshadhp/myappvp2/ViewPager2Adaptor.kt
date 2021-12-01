package com.farshadhp.myappvp2

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.databinding.ItemsInVp2Binding
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import android.os.Bundle

class ViewPager2Adaptor(private var v : Activity) : RecyclerView.Adapter<ViewPager2Adaptor.RVHolder>(){
    private var myList = emptyList<Model>()

    inner class RVHolder(val viewDataBinding: ItemsInVp2Binding) : RecyclerView.ViewHolder(viewDataBinding.root)
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPager2Adaptor.RVHolder {
        val binding  =  ItemsInVp2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  RVHolder(binding)
    }

    override fun onBindViewHolder(holder: RVHolder, position: Int) {
        holder.viewDataBinding.tvId.text = myList[position].id.toString()
        holder.viewDataBinding.tvTitle.text = myList[position].title
        holder.viewDataBinding.vpItem.setOnClickListener {
            val intent = Intent(v, ItemDetailActivity::class.java)
            val b = Bundle()
            intent.putExtra("id",myList[position].id)
            startActivity(v,intent,b)
        }
    }

    override fun getItemCount(): Int {
        return  myList.size
    }

    fun setData(newList: List<Model>){
        myList = newList
        notifyDataSetChanged()
    }

}
