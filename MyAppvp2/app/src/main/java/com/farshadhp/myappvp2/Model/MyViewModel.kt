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
    /*fun getModel(userId: Int,id :Int){
        viewModelScope.launch {
            val response = repository.getModel(userId,id)
            myResponse.value= response
        }
    }*/
    init{
        viewModelScope.launch {
            val response = repository.getCustomModel(1)
            myCustomModel.value = response
        }
    }
    fun getModel(userId: Int,id :Int){
        viewModelScope.launch {
            val response = repository.getModel(userId,id)
            myResponse.value= response
        }
    }
    /*fun getCustomModel(userId: Int) {
        viewModelScope.launch {
            val response = repository.getCustomModel(userId)
            myCustomModel.value = response
        }
    }*/
}