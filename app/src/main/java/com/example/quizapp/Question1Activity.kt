package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityQuestion1Binding

class Question1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestion1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestion1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnQuestion1Choice1.setOnClickListener { incorrectAnswer() }
        binding.btnQuestion1Choice2.setOnClickListener { correctAnswer() }
        binding.btnQuestion1Choice3.setOnClickListener { incorrectAnswer() }
        binding.btnQuestion1Choice4.setOnClickListener { incorrectAnswer() }
    }
    private fun correctAnswer() {
        val toastText = "Correct Answer"
        val toast = Toast.makeText(this, toastText,3)
        toast.show()
        val myIntent = Intent(this, Question2Activity::class.java)
        val myUpdatedScore = 1
        myIntent.putExtra("myScore", myUpdatedScore)
        startActivity(myIntent)
        finish()
    }
    private fun incorrectAnswer() {
        val toastText = "Incorrect Answer"
        val toast = Toast.makeText(this,toastText,3)
        toast.show()
        val myIntent = Intent(this, Question2Activity::class.java)
        startActivity(myIntent)
        finish()
    }
}