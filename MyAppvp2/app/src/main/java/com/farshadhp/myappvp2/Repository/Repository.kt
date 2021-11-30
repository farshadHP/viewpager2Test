package com.farshadhp.myappvp2.Repository

import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.Retrofit.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getModel(userId :Int,id :Int): Response<Model> {
        return RetrofitInstance.api.getModel(/*userId,id*/id)
    }

    suspend fun getCustomModel(userId: Int): Response<List<Model>> {
        return RetrofitInstance.api.getCustomModel(userId)
    }
}