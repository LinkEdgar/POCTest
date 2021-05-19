package com.example.android.pocapp.home.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.android.pocapp.R
import com.example.android.pocapp.home.viewmodels.HomeFragmentViewModel

class HomeFragment : Fragment() {

    private val viewModel by viewModels<HomeFragmentViewModel>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var progressBar: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initUI(requireView())
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    fun initUI(view: View) {
        recyclerView = view.findViewById(R.id.home_recyclerview)
        progressBar = view.findViewById(R.id.progressbar_home)
    }
}