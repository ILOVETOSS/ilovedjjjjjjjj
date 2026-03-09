package com.example.abcd1

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.abcd1.databinding.ActivityAgeBinding
import com.example.abcd1.databinding.ActivityInfoBinding

class ageinfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityAgeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}