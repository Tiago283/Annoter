package com.tiago.annoter.core.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tiago.annoter.features.notes.data.NoteDao
import com.tiago.annoter.features.notes.data.NoteEntity
import com.tiago.annoter.features.tasks.data.TaskDao
import com.tiago.annoter.features.tasks.data.TaskEntity

@Database(entities = [TaskEntity::class, NoteEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao() : TaskDao
    abstract fun noteDao() : NoteDao
}