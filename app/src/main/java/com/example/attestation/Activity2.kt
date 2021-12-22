package com.example.attestation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    lateinit var toDinner: Button
    lateinit var toBreakfast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        toDinner = findViewById(R.id.to_dinner)
        toDinner.setOnClickListener {
            val toDinnerIntent: Intent = Intent(this, Activity3::class.java)
            startActivity(toDinnerIntent)
        }

        toBreakfast = findViewById(R.id.to_breakfast)
        toBreakfast.setOnClickListener {
            val toBreakfastIntent: Intent = Intent(this, Activity1::class.java)
            startActivity(toBreakfastIntent)
        }
    }
}