package com.tiago.annoter.note.data

import com.tiago.annoter.note.domain.models.NoteModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {
    fun getAll(): Flow<List<NoteEntity>> = noteDao.getAll()

    fun getNoteById(noteId: Int) = noteDao.getNoteById(noteId)

    suspend fun insertNote(note: NoteModel) = noteDao.insertNote(note.toNoteEntity())

    suspend fun updateNote(note: NoteModel) = noteDao.updateNote(note.toNoteEntity())

    suspend fun deleteNote(note: NoteModel) = noteDao.deleteNote(note.toNoteEntity())
}