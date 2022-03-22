package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {

            Toast.makeText(this, "Wait while loading ", Toast.LENGTH_SHORT).show()
            binding.btnStart.visibility = View.INVISIBLE
            binding.proStart.visibility = View.VISIBLE
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }


    }
}