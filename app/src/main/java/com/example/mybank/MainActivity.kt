package com.example.mybank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mybank.fragments.Change_PasswordFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {


                val explicitintent = Intent(this, MainActivity2::class.java)
                startActivity(explicitintent)

        }
        var textView2 = findViewById<TextView>(R.id.textView2)
        textView2.setOnClickListener {


            val explicitintent = Intent(this, MainActivity3::class.java)
            startActivity(explicitintent)

        }

        var reg = findViewById<TextView>(R.id.reg)
        reg.setOnClickListener {


            val explicitintent = Intent(this, RegisterActivity::class.java)
            startActivity(explicitintent)

        }



    }
}