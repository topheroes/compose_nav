package com.example.tasteofcompose.composables

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class LoginViewModelState(
    var username: String = "",
    var password: String = "",
    var name: String = ""
)

class LoginViewModel: ViewModel() {

    // LiveData - MutableLiveData, LiveData
    // StateFlow - MutableStateFlow, StateFlow

    private val _loginViewModelState = MutableStateFlow(LoginViewModelState())
    val loginViewModelState: StateFlow<LoginViewModelState> = _loginViewModelState


    fun changeUserName(username: String){
        Log.d("HEHEHE", "CHANGING HERE")
        _loginViewModelState.value = _loginViewModelState.value.copy(username = username)
    }

}