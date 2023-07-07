package com.cihancelik.movieapp.presentation.movies

import com.cihancelik.movieapp.domain.model.Movie

data class MoviesState(
    val isLoading:Boolean = false,
    val movies:List<Movie> = emptyList(),
    val error:String = "",
    val search : String = "ironman"
)