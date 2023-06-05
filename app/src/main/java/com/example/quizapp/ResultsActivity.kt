package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityResultsBinding

class ResultsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myScore = intent.getIntExtra("myScore", 0)
        binding.textViewFinalScore.text = "You got $myScore/10"

        binding.btnStart.setOnClickListener {
            val startGameIntent = Intent(this, Question1Activity::class.java)
            startActivity(startGameIntent)
            finish()
        }
    }
}