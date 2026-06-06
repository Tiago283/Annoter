package com.tiago.annoter.core.di

import android.content.Context
import androidx.room.Room
import com.tiago.annoter.core.data.AppDatabase
import com.tiago.annoter.note.data.NoteDao
import com.tiago.annoter.task.data.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "annoter.db"
        ).build()
    }

    @Provides
    fun provideTaskDao(db: AppDatabase) : TaskDao = db.taskDao()

    @Provides
    fun provideNoteDao(db: AppDatabase) : NoteDao = db.noteDao()
}