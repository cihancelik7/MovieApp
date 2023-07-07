package com.cihancelik.movieapp.data.repository

import com.cihancelik.movieapp.data.remote.MovieAPI
import com.cihancelik.movieapp.data.remote.dto.MovieDetailDto
import com.cihancelik.movieapp.data.remote.dto.MoviesDto
import com.cihancelik.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl@Inject constructor(private val api:MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String) : MoviesDto {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imbdId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imbdId)
    }
}