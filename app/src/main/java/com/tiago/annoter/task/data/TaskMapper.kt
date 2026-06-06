package com.tiago.annoter.task.data

import com.tiago.annoter.task.domain.models.TaskModel

fun TaskModel.toTaskEntity() : TaskEntity = TaskEntity(
    id = id,
    isChecked = isChecked,
    task = task
)

fun TaskEntity.toTaskModel() : TaskModel = TaskModel(
    id = id,
    isChecked = isChecked,
    task = task
)