package com.example.tasteofcompose.composables

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class Destinations{
    Login,
    SignUp
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()



    NavHost(navController = navController, startDestination = Destinations.Login.name) {
        composable(Destinations.Login.name) {
            LogInScreen(navController = navController) }
        composable(Destinations.SignUp.name) {
            SignUpScreen(navController = navController) }

    }

}