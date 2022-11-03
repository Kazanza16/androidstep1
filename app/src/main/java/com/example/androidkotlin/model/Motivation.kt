package com.example.androidkotlin.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Motivation(
    @DrawableRes
    val imageResourceId: Int,
    @StringRes
    val textResourceId:Int,
) {
}