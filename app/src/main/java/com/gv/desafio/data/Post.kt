package com.gv.desafio.data

import com.google.gson.annotations.SerializedName
import com.gv.desafio.api.Post
import com.gv.desafio.api.RetrofitInstance




data class Post(
        @SerializedName("userNameRepository")
        val userNameRepository: String,
        val surNameRepository: String,
        val repositoryNameRepository: String,
        val repositoryTextRepository: String,
        val starIconRepository: Boolean,
        val gitIconRepository: Boolean,
        val numberGitRepository: String,
        val numberStarRepository: String,
        val imageIconRepository: Boolean)



