package com.example.ujiandasar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler

class intro : AppCompatActivity() {
    private val waktu = 4000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Handler().postDelayed({
            val intent = Intent(this@intro, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, waktu)

    }
}