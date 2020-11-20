package com.example.kronon_android_okuno

import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)
        val simpleCalendar = findViewById<SimpleCalendar>(R.id.square_day)
        val calendar = Calendar.getInstance()
        // Get current month
        val month = calendar[Calendar.MONTH]

        //Get current Year
        val year = calendar[Calendar.YEAR]
        simpleCalendar.setUserCurrentMonthYear(month, year)
        simpleCalendar.setCallBack {
            // Create on Click event here.
        }
    }
}
