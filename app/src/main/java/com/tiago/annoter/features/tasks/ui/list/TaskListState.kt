package com.tiago.annoter.features.tasks.ui.list

import androidx.compose.foundation.text.input.TextFieldState
import com.tiago.annoter.features.tasks.domain.models.TaskModel

data class TaskListState(
    val taskList: List<TaskModel> = emptyList(),
    val newTaskTextFieldState: TextFieldState = TextFieldState(""),
    val isLoading: Boolean = true,
)