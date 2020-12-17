package com.example.kronon_android_okuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class InputScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_schedule)

        val button_back = findViewById<ImageButton>(R.id.button_back)
        button_back.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        val input_schedule_button_ok = findViewById<Button>(R.id.input_schedule_button_ok)
        input_schedule_button_ok.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

    }
}