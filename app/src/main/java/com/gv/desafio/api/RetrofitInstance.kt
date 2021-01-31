package com.gv.desafio.api

import retrofit2.Retrofit

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()

    }
}