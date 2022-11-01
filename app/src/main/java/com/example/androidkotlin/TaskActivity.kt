package com.example.androidkotlin

// Task Application Mobile Computing
// Date : 25 October 2022
// Name : Vinza Kauzar Janza (191344029)

import android.content.res.Resources
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TaskActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showdrawFigure()

        }
    }
}


fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showdrawFigure() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight(),

    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xffDC052D),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = com.example.androidkotlin.R.drawable.chainsaw1),
                        contentDescription = "CHAINSAW MAN",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(96.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Manusia Gergaji",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Indonesian",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff004170),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = com.example.androidkotlin.R.drawable.chainsaw2),
                        contentDescription = "CHAINSAW MAN",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(96.dp)
                            .clip(CircleShape)
                    )

                    Text(
                        text = "Chēnsōman",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Jaoanese",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xFF673AB7),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = com.example.androidkotlin.R.drawable.chainsaw3),
                        contentDescription = "CHAINSAW MAN",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(96.dp)
                            .clip(CircleShape)
                    )

                    Text(
                        text = "Hombre Motosierra",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Spanish)",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xff004D98),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {

                        Image(
                            painter = painterResource(id = com.example.androidkotlin.R.drawable.chainsaw4),
                            contentDescription = "CHAINSAW MAN",
                            alignment = Alignment.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .size(96.dp)
                                .clip(CircleShape)
                        )
                    Text(
                        text = "رجل بالمنشار",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Arabic",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff6CABDD),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {

                    Image(
                        painter = painterResource(id = com.example.androidkotlin.R.drawable.chainsaw5),
                        contentDescription = "CHAINSAW MAN",
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(96.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Chainsaw Man",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "English",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffDA291C),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                        Image(
                            painter = painterResource(id = com.example.androidkotlin.R.drawable.chainsaw6),
                            contentDescription = "CHAINSAW MAN",
                            alignment = Alignment.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .size(96.dp)
                                .clip(CircleShape)
                            )
                    Text(
                        text = "전기톱맨",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Korean",
                        fontSize = 14.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}