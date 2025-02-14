package com.example.testkotlin

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.editTextUsername)

        val password = findViewById<EditText>(R.id.editTextPassword)

        val btnLogin = findViewById<AppCompatButton>(R.id.buttonClick)

        btnLogin.setOnClickListener {
            val usernameValue = username.text.toString().trim()

            val passwordValue = password.text.toString().trim()

            if (usernameValue == "trieunv" && passwordValue == "123") {
                Toast.makeText(this, "TĐăng nhập thành công hehee.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Thông tin đăng nhập sai!", Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}