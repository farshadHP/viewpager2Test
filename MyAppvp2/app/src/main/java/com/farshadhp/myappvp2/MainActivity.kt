package com.farshadhp.myappvp2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.farshadhp.myappvp2.Model.MyViewModel
import com.farshadhp.myappvp2.Model.ViewModelFactory
import com.farshadhp.myappvp2.Repository.Repository
import com.farshadhp.myappvp2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private  lateinit var viewModel : MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = RecyclerViewAdaptor()
        //binding.vp.layoutManager()
        binding.rv.layoutManager = LinearLayoutManager(this)
        //GridLayoutManager(this, 2)
        binding.rv.adapter = adapter
        val repository = Repository()
        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MyViewModel::class.java)
        viewModel.getModel()
        viewModel.getCustomModel(1,2)
        viewModel.myCustomModel.observe(this, Observer { response ->
            if(response.isSuccessful){
                response.body()?.let { adapter.setData(response.body()!!) }
            }else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }
        })


    }
}