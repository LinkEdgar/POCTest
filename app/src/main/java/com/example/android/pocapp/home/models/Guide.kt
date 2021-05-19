package com.example.android.pocapp.home.models

import com.google.gson.annotations.SerializedName

data class Guide (

    @SerializedName("startDate") var startDate : String,
    @SerializedName("endDate") var endDate : String,
    @SerializedName("name") var name : String,
    @SerializedName("url") var url : String,
    @SerializedName("venue") var venue : Venue,
    @SerializedName("icon") var icon : String

)

data class Guides (

    @SerializedName("data") var data : List<Guide>

)