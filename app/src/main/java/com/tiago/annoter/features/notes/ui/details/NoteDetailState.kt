package com.tiago.annoter.features.notes.ui.details

import androidx.compose.foundation.text.input.TextFieldState
import com.tiago.annoter.features.notes.domain.models.NoteModel

data class NoteDetailState(
    val note: NoteModel = NoteModel(0, "", ""),
    val titleTextFieldState: TextFieldState = TextFieldState(),
    val noteTextFieldState: TextFieldState = TextFieldState(),
    val isCreating: Boolean = false
)