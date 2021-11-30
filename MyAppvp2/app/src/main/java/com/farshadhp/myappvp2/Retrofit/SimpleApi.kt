package com.farshadhp.myappvp2.Retrofit

import com.farshadhp.myappvp2.Model.Model
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SimpleApi {
    @GET("posts/{postNum}")
    suspend fun getModel(
        //@Query("userId") userId: Int,
        //@Query("id") id: Int
        @Path("postNum") number: Int
    ): Response<Model>

    @GET("posts")
    suspend fun getCustomModel(
        @Query("userId") userId: Int
    ): Response<List<Model>>

}