package com.farshadhp.myappvp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.farshadhp.myappvp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val images = listOf(
            R.drawable.rrcullinan,R.drawable.rrphantom,R.drawable.rrghost
        )
        val imageTexts = listOf(
            "RollsRoyce Cullinan","RollsRoyce Phantom","RollsRoyce Ghost"
        )

        val adapter = ViewPagerAdaptor(images,imageTexts)
        binding.vp.adapter = adapter

    }
}