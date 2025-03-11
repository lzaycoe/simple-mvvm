package io.lzaycoe.mvvm.data.repository

import io.lzaycoe.mvvm.models.UserData
import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData() : UserData {
        delay(3000)

        return UserData("John Doe", 30)
    }
}