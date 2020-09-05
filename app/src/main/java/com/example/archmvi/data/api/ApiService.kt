package com.example.archmvi.data.api

import com.example.archmvi.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getProducts(): List<User>
}