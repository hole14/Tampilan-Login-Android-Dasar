package com.example.ujiandasar

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {

    private lateinit var user: TextView
    private lateinit var email_user: TextView
    private lateinit var nama_user: TextView
    private lateinit var alamat_user: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val username = intent.getStringExtra("EXTRA_USERNAME")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val nama = intent.getStringExtra("EXTRA_NAMA")
        val alamat = intent.getStringExtra("EXTRA_ALAMAT")

        user = findViewById(R.id.sapa)
        user.text = "Welcome, $username"
        email_user = findViewById(R.id.email)
        email_user.text = "Your Email : $email"
        nama_user = findViewById(R.id.nama)
        nama_user.text = "Your Name : $nama"
        alamat_user = findViewById(R.id.alamat)
        alamat_user.text = "Your Address : $alamat"

    }
}