package com.gv.desafio.data

import com.gv.desafio.api.Post
import com.gv.desafio.api.RetrofitInstance

class Repository{
    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}