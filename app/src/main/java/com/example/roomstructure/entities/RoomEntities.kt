package com.example.roomstructure.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "aliens_table")
data class RoomEntities(
    @ColumnInfo(name = "alienName")
    var alienName: String? = null,
    @ColumnInfo(name = "alienRegion")
    var alienRegion: String? = null,
    @ColumnInfo(name = "alienAge")
    var alienAge: Int? = null,
    @ColumnInfo(name = "alienImage")
    var alienImage: String? = null,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
