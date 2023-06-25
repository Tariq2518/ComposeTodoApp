package com.tariq.composetodoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tariq.composetodoapp.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao


}