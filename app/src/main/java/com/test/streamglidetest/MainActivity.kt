package com.test.streamglidetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide
            .with(this)
            .load("https://homepages.cae.wisc.edu/~ece533/images/cat.png")
            .into(image)

    }
}
