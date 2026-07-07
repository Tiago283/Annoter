package com.tiago.annoter.features.notes.data

import com.tiago.annoter.features.notes.domain.models.NoteModel

fun NoteModel.toNoteEntity() : NoteEntity = NoteEntity(
    id = id,
    title = title,
    note = note
)

fun NoteEntity.toNoteModel() : NoteModel = NoteModel(
    id = id,
    title = title,
    note = note
)