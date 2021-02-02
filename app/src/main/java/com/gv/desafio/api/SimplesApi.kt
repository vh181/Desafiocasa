package com.gv.desafio.api

import com.gv.desafio.data.Post
import retrofit2.http.GET

interface SimplesApi {
    @GET("repositories?q=language:Java&sort=stars&page=1")
    suspend fun getPost(): Post
}