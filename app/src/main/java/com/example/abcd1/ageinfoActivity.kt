package com.example.abcd1

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.abcd1.databinding.ActivityAgeBinding

class ageinfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityAgeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun checkAndNavigate() {
            val inputAge = binding.ageEditid.text.toString().trim()

            // 2 & 4번 요건: 숫자 여부 및 빈 값 체크
            if (inputAge.isEmpty()) {
                Toast.makeText(this, "나이를 입력해주세요.", Toast.LENGTH_SHORT).show()
            } else if (!inputAge.all { it.isDigit() }) {
                Toast.makeText(this, "숫자만 입력 가능합니다.", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, sexinfoActivity::class.java)
                intent.putExtra("user_age", inputAge)
                startActivity(intent)
            }
        }


        binding.ageEditid.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_ACTION_NEXT) {
                checkAndNavigate()
                true
            } else {
                false
            }
        }


        binding.button.setOnClickListener {
            val intent = Intent(this, infoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}