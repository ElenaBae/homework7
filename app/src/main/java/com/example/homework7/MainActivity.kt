package com.example.homework7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cactusBtn = findViewById<Button>(R.id.cactus_button)
        val oakBtn = findViewById<Button>(R.id.oak_button)
        val roseBtn = findViewById<Button>(R.id.rose_button)

        val cactus = Cactus()
        val oak = Oak()
        val rose = Rose()

        cactusBtn.setOnClickListener {
            cactus.grow()
            Toast.makeText(this, "Кактус растет", Toast.LENGTH_LONG).show()
        }

        oakBtn.setOnClickListener {
            oak.grow()
            Toast.makeText(this, "Дуб растет", Toast.LENGTH_LONG).show()
        }

        roseBtn.setOnClickListener {
            rose.grow()
            Toast.makeText(this, "Роза растет", Toast.LENGTH_LONG).show()
        }


    }
}