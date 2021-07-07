package com.deepu.caninecare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Registration : AppCompatActivity() {

    private lateinit var etfname: EditText
    private lateinit var etlname: EditText
    private lateinit var etemail: EditText
    private lateinit var etusername: EditText
    private lateinit var etpassword: EditText
    private lateinit var btnRegister: Button
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        etfname = findViewById(R.id.etfname)
        etlname = findViewById(R.id.etlname)
        etemail = findViewById(R.id.etemail)
        etusername = findViewById(R.id.etusername)
        etpassword = findViewById(R.id.etpassword)
        btnRegister = findViewById(R.id.btnRegister)
        btnLogin = findViewById(R.id.btnLogin)

       // btnRegister.setOnClickListener {
        //    val intent = Intent(this@Registration, Dashboard::class.java)
       //     startActivity(intent)
       // }

        btnLogin.setOnClickListener {
            val intent = Intent(this@Registration, MainActivity::class.java)
            startActivity(intent)

        }
    }
}