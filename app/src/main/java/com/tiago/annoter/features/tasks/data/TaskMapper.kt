package com.tiago.annoter.features.tasks.data

import com.tiago.annoter.features.tasks.domain.models.TaskModel

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