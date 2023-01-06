package com.eks.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.eks.todoapp.data.models.TodoTask

@Database(entities = [TodoTask::class], version = 1, exportSchema = false)
abstract class TodoDB : RoomDatabase() {
    abstract fun todoDao(): TodoDAO
}