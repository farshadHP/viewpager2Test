package com.farshadhp.myappvp2.Model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farshadhp.myappvp2.Repository.Repository
import kotlinx.coroutines.launch

class MyViewModel(private  val repository: Repository): ViewModel() {
    var myResponse: MutableLiveData<Model> = MutableLiveData()

    fun getModel(){
        viewModelScope.launch {
            val response:Model = repository.getModel()
            myResponse.value= response
        }
    }
}