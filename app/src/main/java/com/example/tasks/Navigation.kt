package com.example.tasks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class Navigation : AppCompatActivity() {
    private lateinit var btnMove: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        btnMove = findViewById(R.id.myButton)

        btnMove.setOnClickListener {
            navigateToActivity1()
        }

    }

    private inline fun navigateToActivity1() {
        val intent = Intent(this@Navigation, LinearLayout::class.java)
        startActivity(intent)
    }
}