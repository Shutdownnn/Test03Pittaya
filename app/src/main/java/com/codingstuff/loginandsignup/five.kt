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
import kotlinx.android.synthetic.main.activity_five.*
import kotlinx.android.synthetic.main.activity_four.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@five, six::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        A6.setOnClickListener {
            QUIZ.num++
            val intent = Intent(this@five, six::class.java)
            startActivity(intent)
        }

        B6.setOnClickListener {
            showDefaultDialog(this)
        }

        C6.setOnClickListener {
            showDefaultDialog(this)
        }


        D6.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}