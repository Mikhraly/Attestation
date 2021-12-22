package com.example.attestation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {

    lateinit var toLunch2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        toLunch2 = findViewById(R.id.to_lunch2)
        toLunch2.setOnClickListener {
            val toLunch2Intent: Intent = Intent(this, Activity2::class.java)
            startActivity(toLunch2Intent)
        }
    }
}