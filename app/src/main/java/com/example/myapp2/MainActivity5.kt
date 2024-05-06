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

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val eatButton1: Button = findViewById(R.id.eatButton1)
        val playButton1: Button = findViewById(R.id.playButton1)
        val bathButton1: Button = findViewById(R.id.bathButton1)
        val backButton: Button= findViewById(R.id.backButton)
        val buttonSleep: Button= findViewById(R.id.buttonSleep)
        val progressbar10: ProgressBar= findViewById(R.id.progressBar10)


        eatButton1.setOnClickListener {
            val Intent = Intent (this,MainActivity2::class.java)
            startActivity(Intent)
        }
        playButton1.setOnClickListener{
            val Intent = Intent (this,MainActivity3::class.java)
            startActivity(Intent)

        }
        bathButton1.setOnClickListener {
            val Intent = Intent (this,MainActivity4::class.java)
            startActivity(Intent)
        }
        backButton.setOnClickListener {
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)
        }
        buttonSleep.setOnClickListener {
            val currentProgress = progressbar10.progress + 15
            progressbar10.progress =
                if (currentProgress <= progressbar10.max) currentProgress else progressbar10.max
        }
    }
}