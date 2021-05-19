package com.example.android.pocapp.home.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.example.android.pocapp.R
import com.example.android.pocapp.home.adpaters.HomeAdapter
import com.example.android.pocapp.home.models.Guide
import com.example.android.pocapp.home.models.Guides
import com.example.android.pocapp.home.viewmodels.HomeFragmentViewModel

class HomeFragment : Fragment() {

    private val viewModel by viewModels<HomeFragmentViewModel>()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: HomeAdapter
    private lateinit var progressBar: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initUI(requireView())
        observeGuides()
        observeProgressBar()
    }

    private fun observeProgressBar() {
        viewModel.shouldShowProgressbar().observe(viewLifecycleOwner, Observer { shouldShow ->
            if(shouldShow) {
                progressBar.visibility = View.VISIBLE
            } else {
                progressBar.visibility = View.GONE
            }
        })
    }

    private fun observeGuides() {
        viewModel.getGuides().observe(viewLifecycleOwner, Observer { guides ->
            if (guides != null) {
                adapter.data = guides.data as ArrayList<Guide>
                adapter.notifyDataSetChanged()
            }
        })
    }

    private fun initUI(view: View) {
        adapter = HomeAdapter()
        recyclerView = view.findViewById(R.id.home_recyclerview)
        recyclerView.adapter = adapter
        progressBar = view.findViewById(R.id.progressbar_home)
    }
}