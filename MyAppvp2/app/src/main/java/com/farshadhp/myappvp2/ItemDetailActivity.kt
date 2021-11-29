package com.farshadhp.myappvp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:  = FragmentItemDetailBinding.inflate(layoutInflater)
        return binding.root
    }
}
