package com.example.ezquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingstuff.loginandsignup.QUIZ
import com.codingstuff.loginandsignup.R
import kotlinx.android.synthetic.main.activity_end.*
import kotlinx.android.synthetic.main.activity_one.*

class End : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        var ans = QUIZ.num
        textView13.setText("$ans")

    }
}