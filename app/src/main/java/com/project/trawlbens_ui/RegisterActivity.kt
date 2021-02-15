package com.project.trawlbens_ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.project.trawlbens_ui.databinding.ActivitySignUpBinding

class RegisterActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSignUpButton()
    }

    private fun initSignUpButton(){
        binding.usernameEditText.addTextChangedListener {
            checkSignUpButton()
        }
        binding.passwordEditText.addTextChangedListener {
            checkSignUpButton()
        }
        binding.emailEditText.addTextChangedListener {
            checkSignUpButton()
        }
        binding.passwordEditText.addTextChangedListener {
            checkSignUpButton()
        }
        binding.loginButtonTextView.setOnClickListener{
            finish()
        }
        binding.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun checkSignUpButton(){
        binding.signUpButton.isEnabled = !binding.emailEditText.text.isNullOrEmpty()
                && !binding.passwordEditText.text.isNullOrEmpty()
                && !binding.usernameEditText.text.isNullOrEmpty()
    }
}