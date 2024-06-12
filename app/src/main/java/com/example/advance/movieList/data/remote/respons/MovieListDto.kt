package com.example.advance.movieList.data.remote.respons

data class MovieListDto(
    val page: Int,
    val results: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)