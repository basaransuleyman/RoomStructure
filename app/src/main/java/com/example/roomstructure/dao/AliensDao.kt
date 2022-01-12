package com.example.roomstructure.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.roomstructure.entities.AlienEntities


@Dao
interface AliensDao {
    @Query("SELECT * FROM aliens_table ORDER BY id DESC")
    fun getAliens(): LiveData<List<AlienEntities>>

    @Query("DELETE FROM aliens_table WHERE id = :id")
    suspend fun deleteAlienById(id: Int)

    @Delete
    suspend fun deleteAliens(alien: AlienEntities)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAlien(alien: AlienEntities)

    @Update
    suspend fun updateAlien(alien: AlienEntities)
}
