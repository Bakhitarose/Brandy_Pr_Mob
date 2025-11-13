package com.example.brandy_pr_mob

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.widget.Button


class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val EmailSignup: EditText = findViewById(R.id.EmailSignup)
        val setUsername: EditText = findViewById(R.id.setUsername)
        val setPassword: EditText = findViewById(R.id.setPassword)
        val signupbtn: Button = findViewById(R.id.signupbtn)
        val goToLogin: TextView = findViewById(R.id.goToLogin)

        signupbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        goToLogin.setOnClickListener {
            finish()
        }
    }
}
