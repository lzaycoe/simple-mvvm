package io.lzaycoe.mvvm.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData() : UserData {
        delay(3000)

        return UserData("John Doe", 30)
    }
}