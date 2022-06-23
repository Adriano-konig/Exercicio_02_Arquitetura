package br.com.zup.movieflix.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import br.com.zup.movieflix.R
import br.com.zup.movieflix.databinding.ActivityHomeBinding
import br.com.zup.movieflix.home.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this)[HomeViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.getAllMovies()
        observables()
    }

    private fun observables(){
        viewModel.response.observe(this) {
            binding.tvMovies.text = "$it"
        }
    }
}