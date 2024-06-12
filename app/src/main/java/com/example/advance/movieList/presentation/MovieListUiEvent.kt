package com.example.advance.movieList.presentation

sealed interface MovieListUiEvent {
    data class Paginate(val category: String) : MovieListUiEvent
    object Navigate : MovieListUiEvent
}