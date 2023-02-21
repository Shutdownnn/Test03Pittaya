package com.codingstuff.loginandsignup

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ezquiz.one
import kotlinx.android.synthetic.main.activity_quiz.*

class QUIZ : AppCompatActivity() {

    companion object {
        var num = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@QUIZ, one::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        A.setOnClickListener {
            showDefaultDialog(this)
        }

        B.setOnClickListener {
            showDefaultDialog(this)
        }

        C.setOnClickListener {
            num++
            val intent = Intent(this, one::class.java)
            startActivity(intent)
        }

        D.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}
