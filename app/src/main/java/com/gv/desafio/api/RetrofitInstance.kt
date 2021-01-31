package com.gv.desafio.api

import com.gv.desafio.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

    }
    val  api: SimplesApi by lazy {
        retrofit.create(SimplesApi::class.java)
    }
}