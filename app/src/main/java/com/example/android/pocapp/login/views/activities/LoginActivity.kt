package com.example.android.pocapp.login.views.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.pocapp.R
import com.example.android.pocapp.home.views.activities.HomeActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchToHomeActivity()
    }

    private fun switchToHomeActivity() {
        val goToHomeActivity = Intent(this, HomeActivity::class.java)
        startActivity(goToHomeActivity)
    }
}