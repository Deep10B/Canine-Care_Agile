package com.deepu.caninecare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var username: TextInputEditText
    private lateinit var password: TextInputEditText
    private lateinit var btnLogin: Button
    private lateinit var tvSignUp: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.etusername)
        password = findViewById(R.id.etpassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvSignUp = findViewById(R.id.tvSignUp)


        tvSignUp.setOnClickListener {
            val intent1 = Intent( this@MainActivity, Registration::class.java)
            startActivity(intent1)
        }

    }
}