package io.lzaycoe.mvvm.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.lzaycoe.mvvm.data.repository.UserRepository

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideUserRepository() : UserRepository {
        return UserRepository()
    }
}