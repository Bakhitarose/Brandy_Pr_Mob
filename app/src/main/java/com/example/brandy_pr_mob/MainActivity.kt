package com.example.brandy_pr_mob

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val output: TextView = findViewById(R.id.output)
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)
        val loginbtn: Button = findViewById(R.id.loginbtn)
        val goToSignup: TextView = findViewById(R.id.goToSignup)


        loginbtn.setOnClickListener {
            val usernameText = username.text.toString()
            if (password.text.toString() == "password") {
                output.text = "Welcome $usernameText"

                //Connecting with HomeActivity file
                val intent = Intent(this, HomeActivity::class.java)
                // Pass the username to HomeActivity
                intent.putExtra("USERNAME", usernameText)
                startActivity(intent)
                finish()
            } else {
                output.text = "Incorrect Credentials"
            }
        }

            //Connecting to the Sign up page
        goToSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
