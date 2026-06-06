package com.tiago.annoter.task.domain.models

data class TaskModel(
    val id: Int,
    val isChecked: Boolean = false,
    val task: String = ""
)