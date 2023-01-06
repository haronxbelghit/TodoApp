package com.eks.todoapp.data.repositories

import com.eks.todoapp.data.TodoDAO
import com.eks.todoapp.data.models.TodoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class TodoRepository @Inject constructor(private val todoDAO: TodoDAO) {

    val getAllTasks: Flow<List<TodoTask>> = todoDAO.getAllTasks()
    val sortByLowPriprity: Flow<List<TodoTask>> = todoDAO.sortByLowPriority()
    val sortByHighPriprity: Flow<List<TodoTask>> = todoDAO.sortByHighPriority()

    fun getSelectedTasks(taskId: Int): Flow<TodoTask> {
        return todoDAO.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(task: TodoTask) {
        return todoDAO.addTask(todoTask = task)
    }

    suspend fun updateTask(task: TodoTask) {
        return todoDAO.updateTask(todoTask = task)
    }

    suspend fun deleteTask(task: TodoTask) {
        return todoDAO.deleteTask(todoTask = task)
    }

    suspend fun deleteAllTasks() {
        return todoDAO.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String): Flow<List<TodoTask>> {
        return todoDAO.searchDatabase(searchQuery = searchQuery)
    }
}