package com.example.androidkotlin.latihannavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidkotlin.R

@Composable

fun ScreenFirst(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.chainsaw2), contentDescription = null )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate(NavRoute.Screen_Second.name)
        }) {
            Text(text = "Welcome to New World Order")
            
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ScreenFirstPreview(){
    ScreenFirst(rememberNavController())
}
