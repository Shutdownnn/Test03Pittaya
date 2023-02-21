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
import kotlinx.android.synthetic.main.activity_six.*

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        fun showDefaultDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)

            alertDialog.apply {
                setTitle("แจ้งเตือน")
                setMessage("คุณตอบผิด")
                setPositiveButton("ไปข้อถัดไป") { _: DialogInterface?, _: Int ->
                    val intent = Intent(this@eight, nine::class.java)
                    startActivity(intent)
                }
            }.create().show()
        }

        A9.setOnClickListener {
            showDefaultDialog(this)
        }

        B9.setOnClickListener {
            showDefaultDialog(this)
        }

        C9.setOnClickListener {
            QUIZ.num++
            val intent = Intent(this@eight, nine::class.java)
            startActivity(intent)
        }


        D9.setOnClickListener {
            showDefaultDialog(this)
        }
    }
}