package com.cihancelik.movieapp.domain.repository

import com.cihancelik.movieapp.data.remote.dto.MovieDetailDto
import com.cihancelik.movieapp.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search: String): MoviesDto
    suspend fun getMovieDetail(imdbId: String): MovieDetailDto
}