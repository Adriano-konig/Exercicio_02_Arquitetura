package br.com.zup.movieflix.login.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.movieflix.login.model.LoginModel
import br.com.zup.movieflix.login.repository.LoginRepository

class LoginViewModel  : ViewModel() {
    private val repository = LoginRepository()
    private var _response: MutableLiveData<LoginModel> = MutableLiveData()
    val response: LiveData<LoginModel> = _response

    fun authentication (login : LoginModel){
        try {
            _response.value = repository.authenticate(login)
        }catch (ex: Exception){
            Log.i("Error", "------> ${ex.message}")
        }

    }
}
