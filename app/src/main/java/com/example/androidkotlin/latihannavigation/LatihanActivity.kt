package com.example.androidkotlin.latihannavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class LatihanActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            NavigationApp()
        }
    }
}