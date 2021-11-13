package com.example.allowancetracker.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {
    var purchases: MutableList<Purchase> = mutableListOf()

    fun add(purchase: Purchase) {
        purchases.add(purchase)
    }
}