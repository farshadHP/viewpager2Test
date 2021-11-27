package com.farshadhp.myappvp2

import com.farshadhp.myappvp2.Model.Model
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getModel(): Model

}