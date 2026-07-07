package com.tiago.annoter.features.tasks.data

import com.tiago.annoter.features.tasks.domain.models.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepository @Inject constructor(
    private val taskDao: TaskDao
) {
    fun getAll(): Flow<List<TaskEntity>> = taskDao.getAll()

    suspend fun insertTask(task: TaskModel) = taskDao.insertTask(task.toTaskEntity())

    suspend fun updateTask(task: TaskModel) = taskDao.updateTask(task.toTaskEntity())

    suspend fun deleteTask(task: TaskModel) = taskDao.deleteTask(task.toTaskEntity())
}