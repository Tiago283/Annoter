package com.tiago.annoter.core.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tiago.annoter.note.data.NoteDao
import com.tiago.annoter.note.data.NoteEntity
import com.tiago.annoter.task.data.TaskDao
import com.tiago.annoter.task.data.TaskEntity

@Database(entities = [TaskEntity::class, NoteEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao() : TaskDao
    abstract fun noteDao() : NoteDao
}