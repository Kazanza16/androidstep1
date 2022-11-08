package com.example.androidkotlin.latihannavigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationApp(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoute.Screen_First.name
    ){
        composable(NavRoute.Screen_First.name){
            ScreenFirst(navController)
        }
        composable(NavRoute.Screen_Second.name){
            ScreenSecond(navController)
        }
    }
}