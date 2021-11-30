package com.farshadhp.myappvp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.farshadhp.myappvp2.Model.MyViewModel
import com.farshadhp.myappvp2.Model.ViewModelFactory
import com.farshadhp.myappvp2.Repository.Repository
import com.farshadhp.myappvp2.databinding.ActivityItemDetailBinding

class ItemDetailActivity : AppCompatActivity() {
    private  lateinit var viewModel : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityItemDetailBinding = ActivityItemDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = Repository()
        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MyViewModel::class.java)
        viewModel.getModel(1, intent.extras?.getInt("id")!!)
        //viewModel.getCustomModel(1)
        //Toast.makeText(this,viewModel.myResponse.toString(),Toast.LENGTH_LONG).show()
        viewModel.myResponse.observe(this, Observer { response ->
            if(response.isSuccessful){
                //Log.e("hellllllllllllllllo","\n\n\n\n\n\n\n\n hello \n\n\n")
                //response.body()?.let { adapter.setData(response.body()!!) }
                binding.tvDetailId.setText(response.body()?.id.toString())
                binding.tvDetailText.setText(response.body()?.body.toString())
                binding.tvDetailTitle.setText(response.body()?.title.toString())

            }else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }
        })
        //Toast.makeText(this,intent.extras?.getInt("id").toString(),Toast.LENGTH_LONG).show()

    }
}
