package com.example.archmvi.data.api

import com.example.archmvi.data.model.User

class ApiHelperImpl(private val apiService: ApiService) :
    ApiHelper {

    override suspend fun getUsers(): List<User> {
        return apiService.getProducts()
    }

}