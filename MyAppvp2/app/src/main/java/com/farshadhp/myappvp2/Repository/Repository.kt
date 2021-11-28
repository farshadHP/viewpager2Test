package com.farshadhp.myappvp2.Repository

import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.Retrofit.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getModel(): Response<Model> {
        return RetrofitInstance.api.getModel()
    }

    suspend fun getCustomModel(userId: Int,userId2: Int): Response<List<Model>> {
        return RetrofitInstance.api.getCustomModel(userId,userId2)
    }
}