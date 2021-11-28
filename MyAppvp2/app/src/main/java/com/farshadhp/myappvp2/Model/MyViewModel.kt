package com.farshadhp.myappvp2.Model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farshadhp.myappvp2.Repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MyViewModel(private  val repository: Repository): ViewModel() {
    var myResponse: MutableLiveData<Response<Model>> = MutableLiveData()
    var myCustomModel: MutableLiveData<Response<List<Model>>> = MutableLiveData()
    fun getModel(){
        viewModelScope.launch {
            val response = repository.getModel()
            myResponse.value= response
        }
    }
    fun getCustomModel(userId: Int,userId2: Int) {
        viewModelScope.launch {
            val response = repository.getCustomModel(userId,userId2)
            myCustomModel.value = response
        }
    }
}