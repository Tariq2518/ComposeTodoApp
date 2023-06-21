package com.tariq.composetodoapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tariq.composetodoapp.utils.Constants.DATABASE_TODO_TABLE

@Entity(tableName = DATABASE_TODO_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description : String,
    val priority: Priority
)
