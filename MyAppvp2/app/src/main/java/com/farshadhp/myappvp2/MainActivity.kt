package com.farshadhp.myappvp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.rrcullinan,R.drawable.rrphantom,R.drawable.rrghost
        )
        val imageTexts = listOf(
            "RollsRoyce Cullinan","RollsRoyce Phantom","RollsRoyce Ghost"
        )

        val adapter = ViewPagerAdaptor(images,imageTexts)
        vp.adapter = adapter

    }
}