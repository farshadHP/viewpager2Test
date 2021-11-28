package com.farshadhp.myappvp2.Retrofit

import com.farshadhp.myappvp2.Model.Model
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpleApi {
    @GET("posts/1")
    suspend fun getModel(): Response<Model>

    @GET("posts")
    suspend fun getCustomModel(
        @Query("userId") userId: Int,
        @Query("userId") userId2: Int
    ): Response<List<Model>>

}