package com.example.brandy_pr_mob

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val welcomeMessage: TextView = findViewById(R.id.welcomeMessage)

        // Get the username passed from MainActivity
        val username = intent.getStringExtra("USERNAME")
        welcomeMessage.text = "Welcome to the Homepage, $username!"
    }
}
