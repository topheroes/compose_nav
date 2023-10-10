package com.example.tasteofcompose.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LogInScreen() {
    Circle()
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(80.dp)
    ){
        SigLog("Log in", "Already have an account?", " Sign up")
        EmailTextField("Email address")
        PasswordTextField("Password")
        ConfirmButtons("Log in")
    }



}