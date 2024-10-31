package com.example.budgetbuddy

import android.app.Application
import com.example.budgetbuddy.data.Graph
import com.example.budgetbuddy.data.OnBoardingRepository

class MainApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        OnBoardingRepository.initialize(this)
        Graph.provide(this)
    }
}