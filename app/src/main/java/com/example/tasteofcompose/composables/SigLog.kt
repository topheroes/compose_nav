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
fun SigLog(vararg text: String){
    Row {
        Column {
            Text(text = text[0], fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Row {
                Text(text = text[1], fontSize = 12.sp)
                Text(text = text[2], fontSize = 12.sp, color = Color(159,215,255),modifier = Modifier.clickable {  })
            }
        }
    }
}