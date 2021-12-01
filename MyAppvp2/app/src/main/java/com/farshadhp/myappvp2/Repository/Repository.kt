package com.farshadhp.myappvp2.Repository

import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.Retrofit.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class Repository {
    suspend fun getModel(userId :Int,id :Int): Response<Model> = withContext(Dispatchers.Default){
        return@withContext RetrofitInstance.api.getModel(/*userId,id*/id)
    }

    suspend fun getCustomModel(userId: Int): Response<List<Model>> = withContext(Dispatchers.Default){
        return@withContext RetrofitInstance.api.getCustomModel(userId)
    }
}