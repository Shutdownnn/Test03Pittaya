package com.codingstuff.loginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ezquiz.one
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            val intent = Intent(this@MainActivity, QUIZ::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorV2::class.java)
            startActivity(intent)
        }
    }
}