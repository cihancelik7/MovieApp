package com.cihancelik.movieapp.presentation.movie_detail

import com.cihancelik.movieapp.domain.model.MovieDetail

data class MovieDetailState (
    val isLoading : Boolean = false,
    val movie:MovieDetail? = null,
    val error:String = ""
    )