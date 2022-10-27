package com.example.androidkotlin

import android.graphics.Color.red
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource



class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val warnaungu = 0xFF8B3FFF
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
            ) {

                Text(
                    text = "Hallo POLBAN!",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                    color = Color.Green
                )

                Text(
                    text = "Semangat Perjuangan",
                    modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                    color = Color(warnaungu)
                )

                Surface(
                    color = Color.DarkGray,
                    modifier = Modifier.fillMaxWidth(),


                    ) {

                    Text(
                        text = "TETAP MAJU",
                        color = Color.Cyan,
                        modifier = Modifier.padding(16.dp)
                    )


                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Surface(shape = CircleShape) {
                        Image(painter = painterResource(id = R.drawable.resize_16665841371650611012unknownremovebgpreview), contentDescription = "foto")

                    }

                }
            }
        }
    }
}