package com.tiago.annoter.features.notes.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class NoteModel(
    val id: Int,
    val title: String,
    val note: String
)