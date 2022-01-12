package com.example.roomstructure.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AlienApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        insertKoin()
    }

    private fun insertKoin() {
        startKoin() {
            androidContext(this@AlienApplication)
            modules(listOf(AlienModule.noteDB))
        }
    }
}