package com.tiago.annoter.note.data

import com.tiago.annoter.note.domain.models.NoteModel

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