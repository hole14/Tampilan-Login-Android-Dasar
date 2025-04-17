package com.example.ujiandasar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ujiandasar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.akunBaru.setOnClickListener {

                val username = binding.usernameUser.text.toString()
                val password = binding.passwordUser.text.toString()
                val email = binding.emailUser.text.toString()
                val nama = binding.namaLengkap.text.toString()
                val alamat = binding.alamatRumah.text.toString()

                var isEmptyField = false

                if (username.isEmpty()){
                    isEmptyField = true
                    binding.username.error = "Field ini tidak boleh kosong"
                }
                if (password.isEmpty()){
                    isEmptyField = true
                    binding.password.error = "Field ini tidak boleh kosong"
                }
                if (email.isEmpty()){
                    isEmptyField = true
                    binding.email.error = "Field ini tidak boleh kosong"
                }
                if (nama.isEmpty()){
                    isEmptyField = true
                    binding.nama.error = "Field ini tidak boleh kosong"
                }
                if (alamat.isEmpty()){
                    isEmptyField = true
                    binding.alamat.error = "Field ini tidak boleh kosong"
                }
                if (!isEmptyField) {
                val intent = Intent(this@MainActivity, Login::class.java)
                intent.putExtra("EXTRA_USERNAME", username)
                intent.putExtra("EXTRA_PASSWORD", password)
                intent.putExtra("EXTRA_EMAIL", email)
                intent.putExtra("EXTRA_NAMA", nama)
                intent.putExtra("EXTRA_ALAMAT", alamat)

                startActivity(intent)
                finish()
                }
            }
    }
}

