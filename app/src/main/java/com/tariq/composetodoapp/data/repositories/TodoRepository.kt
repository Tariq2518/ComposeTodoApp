package com.tariq.composetodoapp.data.repositories

import com.tariq.composetodoapp.data.TodoDao
import com.tariq.composetodoapp.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TodoRepository @Inject constructor(
    private val todoDao: TodoDao
) {

    val getAllTasks: Flow<List<ToDoTask>> = todoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = todoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return todoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask) {
        todoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask) {
        todoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask) {
        todoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTask() {
        todoDao.deleteAllTasks()
    }

    fun searchDatabase(queryString: String): Flow<List<ToDoTask>> {
        return todoDao.searchDatabase(searchQuery = queryString)
    }


}