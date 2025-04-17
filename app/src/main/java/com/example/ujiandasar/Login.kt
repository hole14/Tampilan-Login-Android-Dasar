package com.example.ujiandasar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ujiandasar.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {

            val user = binding.username.editText?.text.toString()
            val pass = binding.password.editText?.text.toString()

            val username = intent.getStringExtra("EXTRA_USERNAME")
            val password = intent.getStringExtra("EXTRA_PASSWORD")
            val email = intent.getStringExtra("EXTRA_EMAIL")
            val nama = intent.getStringExtra("EXTRA_NAMA")
            val alamat = intent.getStringExtra("EXTRA_ALAMAT")

            if (user == username && pass == password) {

                val intent = Intent(this@Login, HomePage::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                intent.putExtra("EXTRA_PASSWORD", password)
                intent.putExtra("EXTRA_EMAIL", email)
                intent.putExtra("EXTRA_NAMA", nama)
                intent.putExtra("EXTRA_ALAMAT", alamat)
                startActivity(intent)
                finish()
            } else {
                if (user.isEmpty()) {
                    binding.username.error = "Field ini tidak boleh kosong"
                }
                if (pass.isEmpty()) {
                    binding.password.error = "Field ini tidak boleh kosong"
                }
                if (user != username) {
                    binding.username.error = "Username salah"
                }
                if (pass != password) {
                    binding.password.error = "Password salah"
                }
            }
        }
    }
}