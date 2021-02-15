package com.project.trawlbens_ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.project.trawlbens_ui.databinding.ActivitySigninBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySigninBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSignInButton()
    }

    private fun initSignInButton(){
        binding.emailEditText.addTextChangedListener {
            checkSignInButton()
        }
        binding.passwordEditText.addTextChangedListener {
            checkSignInButton()
        }
        binding.sigupButtonTextView.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun checkSignInButton(){
        binding.loginButton.isEnabled = !binding.emailEditText.text.isNullOrEmpty()
                && !binding.passwordEditText.text.isNullOrEmpty()
    }
}