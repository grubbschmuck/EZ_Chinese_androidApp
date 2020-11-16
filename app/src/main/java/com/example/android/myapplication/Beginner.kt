package com.example.android.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beginner.*

class Beginner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beginner)

        bBtn1.setOnClickListener{
            val intent = Intent(this, beginner01::class.java)
            startActivity(intent)
        }

        bBtn2.setOnClickListener{
            val intent = Intent(this, beginner02::class.java)
            startActivity(intent)
        }

        bBtn3.setOnClickListener{
            val intent = Intent(this, beginner03::class.java)
            startActivity(intent)
        }

        bBtn4.setOnClickListener{
            val intent = Intent(this, beginner04::class.java)
            startActivity(intent)
        }

    }
}