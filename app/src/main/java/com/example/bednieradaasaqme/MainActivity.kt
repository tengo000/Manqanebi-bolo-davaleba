package com.example.bednieradaasaqme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val images = listOf<Image>(
            Image("Hyundai Sonata", R.drawable.sonata),
            Image("Mercedes", R.drawable.merc),
            Image("Volkswagen Jetta", R.drawable.jetta),
            Image("BMW", R.drawable.bmw),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)

    }
}

