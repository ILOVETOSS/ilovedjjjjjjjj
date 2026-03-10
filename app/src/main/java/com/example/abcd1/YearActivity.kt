package com.example.abcd1

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.abcd1.databinding.ActivityAgeBinding
import com.example.abcd1.databinding.ActivityInfoBinding
import com.example.abcd1.databinding.ActivitySexBinding
import com.example.abcd1.databinding.ActivityYearBinding

class YearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityYearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            // 날짜를 누르면 여기가 실행됩니다.
            val intent = Intent(this, TimeActivity::class.java)

            // 만약 다음 화면에 날짜 데이터를 보내고 싶다면 아래처럼 추가 (선택사항)
            // intent.putExtra("selectedDate", "$year-${month + 1}-$dayOfMonth")

            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val intent = Intent(this, sexinfoActivity::class.java) // Activity 이름 대소문자 확인!
            startActivity(intent)
        }



    }
}