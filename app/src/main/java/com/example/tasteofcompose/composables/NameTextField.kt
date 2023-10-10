package com.example.tasteofcompose.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun NameTextField(label: String){
    val text = remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text.value,
        onValueChange = { text.value = it},
        label = { Text(label, modifier = Modifier.padding(start = 10.dp))},
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
    )
}

