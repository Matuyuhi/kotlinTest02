package com.matuyuhi.test03

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.matuyuhi.test03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    private var numCount = 0

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        val countButton : Button = findViewById(R.id.countButton)
//        val countLabel : Button = findViewById(R.id.countLabel)
        updateCount()
    }

    fun updateCount() {
        numCount++
        binding.countLabel.text = numCount.toString()
    }

    fun clickButton(view: View) {
        updateCount()
    }
}