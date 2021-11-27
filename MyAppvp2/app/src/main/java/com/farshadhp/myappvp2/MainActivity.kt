package com.farshadhp.myappvp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val images = listOf(
//            listOf(R.drawable.rrcullinan,R.drawable.rrphantom,R.drawable.rrghost),
//            listOf(R.drawable.bmw1,R.drawable.bmw2,R.drawable.bmw3)
//        )
//        val imageTexts = listOf(
//            listOf("RollsRoyce Cullinan","RollsRoyce Phantom","RollsRoyce Ghost"),
//            listOf("BMW X3","BMW M3","BMW M5")
//
 //       )
        val images = listOf(
            Model("RollsRoyce Cullinan",R.drawable.rrcullinan),
            Model("RollsRoyce Cullinan",R.drawable.rrcullinan),
            Model("RollsRoyce Cullinan",R.drawable.rrcullinan),

        )
        val adapter = RecyclerViewAdaptor(images,imageTexts)
        //binding.vp.layoutManager()
        binding.rv.layoutManager = LinearLayoutManager(this)
                //GridLayoutManager(this, 2)
        binding.rv.adapter = adapter

    }
}