package com.example.android.pocapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {


    var retrofit = Retrofit.Builder()
        .baseUrl(" https://guidebook.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}