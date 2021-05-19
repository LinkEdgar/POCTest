package com.example.android.pocapp.home.models

import com.google.gson.annotations.SerializedName

data class Venue (

    @SerializedName("city") var city : String,
    @SerializedName("state") var state : String

)