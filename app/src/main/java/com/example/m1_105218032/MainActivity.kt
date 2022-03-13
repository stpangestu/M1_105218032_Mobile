package com.example.m1_105218032

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gambar1 = findViewById(R.id.imageView) as ImageView
        // set on-click listener
        gambar1.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "ini gambar.", Toast.LENGTH_SHORT).show()
    }
        val gambar2 = findViewById(R.id.imageView4) as ImageView
        // set on-click listener
        gambar2.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "ini gambar.", Toast.LENGTH_SHORT).show()
        }
        val gambar3 = findViewById(R.id.imageView5) as ImageView
        // set on-click listener
        gambar3.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "ini gambar.", Toast.LENGTH_SHORT).show()
        }
        val gambar4 = findViewById(R.id.imageView2) as ImageView
        // set on-click listener
        gambar4.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "ini gambar.", Toast.LENGTH_SHORT).show()
        }
}}
