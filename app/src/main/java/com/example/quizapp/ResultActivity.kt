package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val mUsername = intent.getStringExtra(Constants.USER_NAME)
        val mAmountOfQuestions = intent.getStringExtra(Constants.TOTAL_QUESTIONS)
        val mCorrectAnswers = intent.getStringExtra(Constants.CORRECT_ANSWERS)

        tv_name.text = mUsername
        tv_score.text = "Your score is ${mCorrectAnswers} / ${mAmountOfQuestions}"

        btn_finish.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}