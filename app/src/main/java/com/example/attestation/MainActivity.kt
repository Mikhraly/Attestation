package com.example.attestation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var toBreakfast: Button
    lateinit var toStore: Button
    lateinit var toClose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toBreakfast = findViewById(R.id.to_breakfast)
        toBreakfast.setOnClickListener {
            val toBreakfastIntent: Intent = Intent(this, Activity1::class.java)
            startActivity(toBreakfastIntent)
        }

        toStore = findViewById(R.id.to_store)
        toStore.setOnClickListener{
            val storeLink = Uri.parse("https://www.vprok.ru/?utm_source=yandex&utm_medium=cpc&utm_campaign=y-search-tgo-brand-aud_nonbuy-all-day-msk&utm_term=perekrestok&utm_content=rw%7Ccampaign-y-search-tgo-brand-aud_nonbuy-all-day-msk%7Ccampaignid-63218337%7Ckeyword-perekrestok%7Cgroupid-4612801440%7Cdevice-desktop%7Cregionid-213%7Cad-10871214991%7Cplacement-none%7Cphraseid-32675155153%7Cadvar-dafault%7Cother%7Cregion-Москва&yclid=7311114836998673303")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, storeLink)
            //val chooser = Intent.createChooser(openBrowserIntent, "Browser")
            startActivity(openBrowserIntent)
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()

        toClose = findViewById(R.id.close_button)
        toClose.setOnClickListener {
            onStop()
            onDestroy()
            onDestroy()
        }
    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}