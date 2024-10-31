package com.example.budgetbuddy.ui.util

import java.text.SimpleDateFormat
import java.util.Date

fun TimeConverter(currentMilliseconds: Long): String {
    val sdf = SimpleDateFormat("HH:mm")

    val currentTime = Date(currentMilliseconds)

    return sdf.format(currentTime)
}