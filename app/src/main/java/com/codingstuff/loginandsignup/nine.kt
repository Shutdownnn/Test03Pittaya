package com.example.ezquiz

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.codingstuff.loginandsignup.QUIZ
import com.codingstuff.loginandsignup.R
import kotlinx.android.synthetic.main.activity_eight.*
import kotlinx.android.synthetic.main.activity_nine.*

class nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@nine, End::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        A10.setOnClickListener {
            QUIZ.num++
            val intent = Intent(this@nine, End::class.java)
            startActivity(intent)
        }

        B10.setOnClickListener {
            showDefaultDialog(this)
        }

        C10.setOnClickListener {
            QUIZ.num++
            val intent = Intent(this@nine, End::class.java)
            startActivity(intent)
        }

        D10.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}