package com.farshadhp.myappvp2.Repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.farshadhp.myappvp2.Model.MyViewModel

class ViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MyViewModel(repository) as T
    }

}