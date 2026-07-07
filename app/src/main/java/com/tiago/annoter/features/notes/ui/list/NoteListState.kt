package com.tiago.annoter.features.notes.ui.list

import com.tiago.annoter.features.notes.domain.models.NoteModel

data class NoteListState(
    val noteList: List<NoteModel> = emptyList(),
    val isLoading: Boolean = true,
)
