package com.example.roomstructure.di

import android.app.Application
import androidx.room.Room
import com.example.roomstructure.dao.AliensDao
import com.example.roomstructure.db.AliensDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

object AlienModule {
    val noteDB = module {
        fun provideDataBase(application: Application): AliensDatabase {
            return Room.databaseBuilder(application, AliensDatabase::class.java, "aliens_database")
                .fallbackToDestructiveMigration()
                .build()
        }
        fun provideDao(dataBase: AliensDatabase): AliensDao {
            return dataBase.aliensDao()
        }
        single { provideDataBase(androidApplication()) }
        single { provideDao(get()) }
    }
}