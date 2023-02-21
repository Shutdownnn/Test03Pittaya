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
import kotlinx.android.synthetic.main.activity_one.*
import kotlinx.android.synthetic.main.activity_two.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                //setIcon(R.drawable.ic_hello)
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        A3.setOnClickListener {
            showDefaultDialog(this)
        }

        B3.setOnClickListener {
            QUIZ.num++
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)
        }

        C3.setOnClickListener {
            showDefaultDialog(this)
        }


        D3.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}