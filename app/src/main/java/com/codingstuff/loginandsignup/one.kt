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
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                //setIcon(R.drawable.ic_hello)
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@one, two::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        A2.setOnClickListener {
            showDefaultDialog(this)
        }

        B2.setOnClickListener {
            showDefaultDialog(this)
        }

        C2.setOnClickListener {
            showDefaultDialog(this)
        }

        D2.setOnClickListener {
            QUIZ.num++
            val intent = Intent(this@one, two::class.java)
            startActivity(intent)
        }
    }
}