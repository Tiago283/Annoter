package com.tiago.annoter.note.ui.details

import androidx.compose.foundation.text.input.TextFieldState
import com.tiago.annoter.note.domain.models.NoteModel

data class NoteDetailState(
    val note: NoteModel = NoteModel(0, "", ""),
    val titleTextFieldState: TextFieldState = TextFieldState(),
    val noteTextFieldState: TextFieldState = TextFieldState(),
    val isCreating: Boolean = false
)