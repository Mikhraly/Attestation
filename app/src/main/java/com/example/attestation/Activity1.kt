package com.example.attestation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity1 : AppCompatActivity() {

    lateinit var toLunch: Button
    lateinit var toStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        toLunch = findViewById(R.id.to_lunch)
        toLunch.setOnClickListener {
            val toLunchIntent: Intent = Intent(this, Activity2::class.java)
            startActivity(toLunchIntent)
        }

        toStart = findViewById(R.id.to_main)
        toStart.setOnClickListener {
            val toStartIntent: Intent = Intent(this, MainActivity::class.java)
            startActivity(toStartIntent)
        }
    }
}