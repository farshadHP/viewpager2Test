package com.farshadhp.myappvp2

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.farshadhp.myappvp2.Model.MyViewModel
import com.farshadhp.myappvp2.Model.ViewModelFactory
import com.farshadhp.myappvp2.Repository.Repository
import com.farshadhp.myappvp2.databinding.ActivityItemDetailBinding
import com.farshadhp.myappvp2.databinding.LoadingDialogBinding
import retrofit2.Response

class ItemDetailActivity : AppCompatActivity() {
    private  lateinit var viewModel : MyViewModel
    private lateinit var  loadingDialog: Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityItemDetailBinding = ActivityItemDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = Repository()
        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MyViewModel::class.java)
        //viewModel.getModel(1, intent.extras?.getInt("id")!!)
        loadingDialog = Dialog(this)
        val dialogBinding : LoadingDialogBinding = LoadingDialogBinding.inflate(layoutInflater)
        loadingDialog.setContentView(dialogBinding.root)
        loadingDialog.show()
        loadingDialog.setCancelable(false)
        Handler().postDelayed({
            loadingDialog.dismiss()
        },1000)
        viewModel.myCustomModel.observe(this, Observer { response ->
            if(response.isSuccessful){
                for(model in response.body()!!){
                    if(model.id == intent.extras?.getInt("id")!!) {
                        binding.tvDetailId.setText(model.id.toString())
                        binding.tvDetailText.setText(model.body.toString())
                        binding.tvDetailTitle.setText(model.title.toString())
                    }
                }

            }else {
                Toast.makeText(this, response.code(), Toast.LENGTH_SHORT).show()
            }
        })
    }
}
