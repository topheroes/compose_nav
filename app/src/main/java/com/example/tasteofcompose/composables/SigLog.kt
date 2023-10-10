package com.example.tasteofcompose.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SigLog(headerText: String, hintText: String, buttonText: String, buttonHandler: ()->Unit){
    Row {
        Column {
            Text(text = headerText, fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Row {
                Text(text = hintText, fontSize = 12.sp)
                Text(text = buttonText, fontSize = 12.sp, color = Color(0xFF0094FF),modifier = Modifier.clickable(onClick = buttonHandler))
            }
        }
    }
}