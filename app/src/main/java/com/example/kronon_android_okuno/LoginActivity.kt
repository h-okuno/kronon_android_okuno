package com.example.kronon_android_okuno

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val button_login = findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener {
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        val button_create_new_account = findViewById<Button>(R.id.create_new_account_button)
        button_create_new_account.setOnClickListener {
            val intent = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(intent)
        }
    }
}