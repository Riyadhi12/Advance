package com.example.advance.movieList.util

sealed class Screen (val route: String){
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object NowPlayingMovieList : Screen("nowPlayingMovie")
    object Details : Screen("detail")
    object Login : Screen("login")
}