package br.com.zup.movieflix.home.repository

import br.com.zup.movieflix.R
import br.com.zup.movieflix.home.model.Movie

class HomeRepository {

    fun getListMovie(): List<Movie> {
        val listMovie = mutableListOf<Movie>()

        listMovie.add(Movie("A era do Gelo", "Teste teste", R.drawable.a_era_gelo))
        listMovie.add(Movie("Capitão Fantástico", "Teste teste", R.drawable.capitao_fantastico))

        return listMovie
    }
}