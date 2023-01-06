package com.eks.todoapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.eks.todoapp.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class TodoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)