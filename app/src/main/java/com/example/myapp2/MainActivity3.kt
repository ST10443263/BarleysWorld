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

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bathButton: Button= findViewById(R.id.buttonBathe)
        val buttonPlay: Button= findViewById(R.id.buttonPlay)
        val progressBar4: ProgressBar= findViewById(R.id.progressBar4)

        bathButton.setOnClickListener {
            val Intent = Intent (this,MainActivity4::class.java)
            startActivity(Intent)
        }
        buttonPlay.setOnClickListener {
            val currentProgress = progressBar4.progress + 15
            progressBar4.progress =
                if (currentProgress <= progressBar4.max) currentProgress else progressBar4.max

            progressBar4.max = 100 //(OPEN AI,2023)
        }
    }
}