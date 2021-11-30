package com.farshadhp.myappvp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farshadhp.myappvp2.databinding.ActivityItemDetailBinding

class ItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityItemDetailBinding = ActivityItemDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
