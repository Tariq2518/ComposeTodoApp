package com.tariq.composetodoapp.di

import android.content.Context
import androidx.room.Room
import com.tariq.composetodoapp.data.TodoDatabase
import com.tariq.composetodoapp.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        TodoDatabase::class.java,
        DATABASE_NAME
    ).build()


    @Singleton
    @Provides
    fun providesDao(
        database: TodoDatabase
    ) = database.todoDao()

}