package com.tiago.annoter.navigation

import androidx.navigation3.runtime.NavKey
import com.tiago.annoter.note.domain.models.NoteModel
import kotlinx.serialization.Serializable

interface Route : NavKey {
    @Serializable
    data object TaskList : Route
    @Serializable
    data object NoteList : Route
    @Serializable
    data class NoteDetail(val note: NoteModel) : Route
}