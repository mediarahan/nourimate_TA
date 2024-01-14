package com.telyu.nourimate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.telyu.nourimate.databinding.ActivityLoginBinding
import android.widget.Toast
import android.content.Intent



class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Inisialisasi event handling atau fungsi login di sini
        initLogin()

        // Tambahkan fungsi untuk membuka halaman sign-up
        binding.buttonSignUp.setOnClickListener {
            openSignUpPage()
        }
    }

    private fun initLogin() {
        binding.buttonLogin.setOnClickListener {
            // Handle login logic here
            val username = binding.editTextUsername.text.toString()
            val password = binding.editTextPassword.text.toString()

            // Implement your authentication logic
            // For simplicity, just show a toast message
            // In a real application, you would typically validate credentials against a server
            showToast("Login clicked. Username: $username, Password: $password")
        }
    }

    private fun openSignUpPage() {
        // Buat Intent untuk membuka SignUpActivity
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

