package com.tiago.annoter.note.ui.list

import com.tiago.annoter.note.domain.models.NoteModel


data class NoteListState(
    val noteList: List<NoteModel> = emptyList(),
    val isLoading: Boolean = true,
)
