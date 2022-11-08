package com.example.kotlin_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_examples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpView()
    }

    /** */
    private fun setUpView() {
    }


}
