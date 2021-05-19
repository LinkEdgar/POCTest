package com.example.android.pocapp.home.models

import com.google.gson.annotations.SerializedName

data class Venue (

    @SerializedName("city") var city : String? = "N/A",
    @SerializedName("state") var state : String? = "N/A"

)