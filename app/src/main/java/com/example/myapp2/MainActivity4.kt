package com.example.myapp2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sleepButton: Button= findViewById(R.id.sleepButton)
        val buttonBathe: Button= findViewById(R.id.buttonBathe)
        val progressBar7: ProgressBar= findViewById(R.id.progressBar7)


        sleepButton.setOnClickListener {
            val Intent = Intent (this,MainActivity5::class.java)
            startActivity(Intent)
        }
        buttonBathe.setOnClickListener {
            val currentProgress = progressBar7.progress + 15
            progressBar7.progress =
                if (currentProgress <= progressBar7.max) currentProgress else progressBar7.max//(Open AI,2023)



        }
    }
}