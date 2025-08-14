package com.example.opsc6312demo1

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // Get posts for a specific user, limited to a certain number
    @GET("posts")
    fun getPost(
        @Query("userId") userId: Int,
        @Query("_limit") limit: Int
    ): Call<List<Post>>
}

