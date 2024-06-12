package com.example.advance.movieList.presentation

import com.example.advance.movieList.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = false,

    val popularMovieListPage: Int = 1,
    val nowPlayingMovieListPage: Int = 1,

    val isCurrentPopularScreen: Boolean = true,

    val popularMovieList: List<Movie> = emptyList(),
    val nowPlayingMovieList: List<Movie> = emptyList()
)