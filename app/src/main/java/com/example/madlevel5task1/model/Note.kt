package com.example.madlevel5task1.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "noteTable")
class Note(
    @ColumnInfo(name = "title") var noteTitle: String,
    @ColumnInfo(name = "lastUpdated") var lastUpdated: Date,
    @ColumnInfo(name = "text") var noteText: String,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var noteId: Long? = null
)