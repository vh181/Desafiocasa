package com.gv.desafio.data

import com.gv.desafio.api.Post
import com.gv.desafio.api.RetrofitInstance

class Repositori{

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }
}