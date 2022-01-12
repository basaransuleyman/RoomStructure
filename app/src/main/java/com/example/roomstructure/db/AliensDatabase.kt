package com.example.roomstructure.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomstructure.dao.AliensDao
import com.example.roomstructure.entities.AlienEntities

@Database(entities = [AlienEntities::class], version = 1, exportSchema = false)
abstract class AliensDatabase : RoomDatabase() {
    abstract fun aliensDao(): AliensDao
}

