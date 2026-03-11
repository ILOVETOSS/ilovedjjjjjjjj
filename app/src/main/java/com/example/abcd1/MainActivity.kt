package com.example.abcd1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.abcd1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.moonbtn.setOnClickListener {
            val intent = Intent(this, CoinActivity::class.java)
            startActivity(intent)
        }

        binding.dailyTarot.setOnClickListener {
            val intent = Intent(this, DailyTarotActivity::class.java)
            startActivity(intent)
        }
        binding.image1.setOnClickListener {
            Toast.makeText(this,"기능 준비중", Toast.LENGTH_SHORT).show()
        }
        binding.image2.setOnClickListener {
            Toast.makeText(this,"기능 준비중", Toast.LENGTH_SHORT).show()
        }
        binding.dailyMaster.setOnClickListener {
            val url = "https://ko.wikipedia.org/wiki/타로"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }




    }
}