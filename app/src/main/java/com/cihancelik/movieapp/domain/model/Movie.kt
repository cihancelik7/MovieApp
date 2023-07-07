package com.cihancelik.movieapp.domain.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("imdbID")
    val imdbID: String,
    @SerializedName("Poster")
    val poster: String,
    @SerializedName("Title")
    val type: String,
    @SerializedName("Year")
    val year: String
)
