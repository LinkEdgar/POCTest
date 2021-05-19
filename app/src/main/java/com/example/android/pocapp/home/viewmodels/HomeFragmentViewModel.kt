package com.example.android.pocapp.home.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.pocapp.home.models.Guides
import com.example.android.pocapp.home.repositories.HomeRepository
import kotlinx.coroutines.launch

class HomeFragmentViewModel :ViewModel(){

    private var shouldShowProgressBar = MutableLiveData<Boolean>(false)
    private var guides = MutableLiveData<Guides>()
    var homeRepo: HomeRepository = HomeRepository

    fun getGuides() : LiveData<Guides>{
        shouldShowProgressBar.value = true
        viewModelScope.launch {
            val guideList = homeRepo.getGuides()
            guides.postValue(guideList)
            shouldShowProgressBar.postValue(false)
        }

        return guides
    }

    fun shouldShowProgressbar() : LiveData<Boolean>{
        return shouldShowProgressBar
    }

}