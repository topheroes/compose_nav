package com.example.tasteofcompose.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun LogInScreen(navController: NavController) {


    val handleNav = {
        navController.navigate(Destinations.SignUp.name)
    }


    Circle()
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(80.dp)
    ){
        SigLog("Log in", "Already have an account?", " Sign up", handleNav )
        EmailTextField("Email address")
        PasswordTextField("Password")
        ConfirmButtons("Log in")
    }



}