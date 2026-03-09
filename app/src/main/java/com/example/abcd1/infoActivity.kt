package com.example.abcd1

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.abcd1.databinding.ActivityAgeBinding
import com.example.abcd1.databinding.ActivityInfoBinding

class infoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 검사 및 이동 로직을 하나의 함수로 분리 (중복 방지)
        fun checkAndNavigate() {
            // EditText의 id를 확인하세요 (예: binding.editTextId)
            val inputName = binding.editid.text.toString().trim()

            if (inputName.length < 2 || inputName.length > 20) {
                Toast.makeText(this, "2자 이상 20자 이하로 입력해라", Toast.LENGTH_SHORT).show()
            } else {
                // 조건 만족 시 이동
                val intent = Intent(this, ageinfoActivity::class.java)
                intent.putExtra("user_name", inputName)
                startActivity(intent)
            }
        }

        // 1. 엔터 키(완료/다음) 감지
        binding.editid.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_ACTION_NEXT) {
                checkAndNavigate()
                true // 이벤트 소비
            } else {
                false
            }
        }

        // 2. 버튼 클릭 시에도 동일하게 검사
        binding.button.setOnClickListener {
            val intent = Intent(this, onboardingActivity::class.java)
            startActivity(intent)
        }
    }
}