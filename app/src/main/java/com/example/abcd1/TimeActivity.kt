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
import com.example.abcd1.databinding.ActivityTimeBinding
import com.example.abcd1.databinding.ActivityYearBinding

class TimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // 기존 클릭 리스너는 지우고 이걸 넣으세요
        binding.calview.setOnTimeChangedListener { view, hourOfDay, minute ->
            // 바늘을 돌릴 때마다 호출됩니다.
            // 사용자가 '선택을 마쳤다'고 판단할 로직이 필요하거나,
            // 그냥 바늘 움직이면 바로 넘어가게 하려면 아래 Intent 실행

            val intent = Intent(this, InfoMainActivity::class.java)

            // 선택한 시간 정보를 다음 화면에 전달 (선택사항)
            intent.putExtra("selectedHour", hourOfDay)
            intent.putExtra("selectedMinute", minute)

            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val intent = Intent(this, YearActivity::class.java)
            startActivity(intent)
        }
        binding.backButton.setOnClickListener {
            val intent = Intent(this, InfoMainActivity::class.java)
            startActivity(intent)
        }




    }
}