package com.tiago.annoter.features.tasks.domain.models

data class TaskModel(
    val id: Int,
    val isChecked: Boolean = false,
    val task: String = ""
)