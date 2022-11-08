package com.example.androidkotlin.latihannavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenSecond(navController : NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = { navController.popBackStack() },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFFE95606),
            contentColor = Color.White
        )) {
        Text(text = "HELLO WORLD")
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ScreenSecondPreview() {
    ScreenSecond(rememberNavController())
}