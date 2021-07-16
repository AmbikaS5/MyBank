package com.example.mybank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mybank.fragments.Change_PasswordFragment

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var but2 = findViewById<Button>(R.id.but2)
        but2.setOnClickListener {


            val explicitintent = Intent(this, MainActivity2::class.java)
            startActivity(explicitintent)

        }


        }
    }
