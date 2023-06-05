package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityQuestion2Binding
import com.example.quizapp.databinding.ActivityQuestion7Binding

class Question7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myScore = intent.getIntExtra("myScore", 0)
        binding.textViewScore3.text = myScore.toString()

        binding.btnQuestion1Choice1.setOnClickListener { incorrectAnswer(myScore) }
        binding.btnQuestion1Choice2.setOnClickListener { incorrectAnswer(myScore) }
        binding.btnQuestion1Choice3.setOnClickListener { correctAnswer(myScore) }
        binding.btnQuestion1Choice4.setOnClickListener { incorrectAnswer(myScore) }
    }
    private fun correctAnswer(myScore: Int) {
        //Toast
        val toastText = "Correct Answer"
        val toast = Toast.makeText(this, toastText,3)
        toast.show()
        //Switch Activity
        val myIntent = Intent(this, Question8Activity::class.java)
        val myUpdatedScore = myScore + 1
        myIntent.putExtra("myScore", myUpdatedScore)
        startActivity(myIntent)
        finish()
    }
    private fun incorrectAnswer(myScore: Int) {
        //Toast
        val toastText = "Incorrect Answer"
        val toast = Toast.makeText(this,toastText,3)
        toast.show()
        //Switch Activity
        val myIntent = Intent(this, Question8Activity::class.java)
        val myUpdatedScore = myScore
        myIntent.putExtra("myScore", myUpdatedScore)
        startActivity(myIntent)
        finish()
    }
}