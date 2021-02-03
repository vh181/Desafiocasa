package com.gv.desafio.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gv.desafio.data.Repository

class RepositoryViewModelFactory(private val repository: Repository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RepositoryModel(repository)as T
    }
}