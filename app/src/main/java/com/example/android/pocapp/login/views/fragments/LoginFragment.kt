package com.example.android.pocapp.login.views.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.android.pocapp.R
import com.example.android.pocapp.home.views.activities.HomeActivity

class LoginFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initUI(requireView())
        return inflater.inflate(R.layout.fragment_login, container,false)
    }

    private fun initUI(view: View) {
        val loginButton = view.findViewById<Button>(R.id.login_button).apply {
            setOnClickListener {
                switchToHomeActivity()
            }
        }
    }

    private fun switchToHomeActivity() {
        val goToHomeActivity = Intent(requireContext(), HomeActivity::class.java)
        startActivity(goToHomeActivity)
    }
}