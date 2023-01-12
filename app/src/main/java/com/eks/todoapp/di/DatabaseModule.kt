package com.eks.todoapp.di

import android.content.Context
import androidx.room.Room
import com.eks.todoapp.data.TodoDB
import com.eks.todoapp.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
//test comment
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        TodoDB::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDAO(database: TodoDB) = database.todoDao()
}