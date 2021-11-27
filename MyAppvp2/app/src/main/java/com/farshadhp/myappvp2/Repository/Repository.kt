package com.farshadhp.myappvp2.Repository

import com.farshadhp.myappvp2.Model.Model
import com.farshadhp.myappvp2.Retrofit.RetrofitInstance

class Repository {
    suspend fun getModel(): Model {
        return RetrofitInstance.api.getModel()
    }
}