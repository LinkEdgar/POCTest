package com.example.android.pocapp.home.repositories

import com.example.android.pocapp.home.models.Guides
import retrofit2.http.GET

interface HomeService {

    @GET("service/v2/upcomingGuides/")
    suspend fun getGuides(): Guides
}