package com.example.android.pocapp.home.repositories

import com.example.android.pocapp.home.models.Guides
import com.example.android.pocapp.network.RetrofitBuilder

object HomeRepository {

    val homeService = RetrofitBuilder.retrofit.create(HomeService::class.java)
    suspend fun getGuides(): Guides{
        return homeService.getGuides()
    }
}