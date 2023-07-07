package com.cihancelik.movieapp.data.remote

import com.cihancelik.movieapp.data.remote.dto.MovieDetailDto
import com.cihancelik.movieapp.data.remote.dto.MoviesDto
import com.cihancelik.movieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    //http://www.omdbapi.com/?apikey=968f730d&s=batman
    //http://www.omdbapi.com/?apikey=968f730d&i=tt0372784

    // http://www.omdbapi.com/?i=tt3896198&apikey=968f730d


    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apiKey : String = API_KEY
    ): MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId: String,
        @Query("apikey") apiKey : String = API_KEY
    ):MovieDetailDto
}