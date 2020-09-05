package com.example.archmvi.data.api

import com.example.archmvi.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}