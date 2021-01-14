package com.gv.desafio.data

data class Git (
    val user_name : String,
    val sobre_name: String,
    val reposi_name: String,
    val repsoi_text: String,
    val star_icon: Boolean,
    val git_icon: Boolean,
    val n_git: String,
    val n_star: String,
    val img_icon: Boolean)


class GitBuilder{
    var user_name : String=""
    var sobre_name: String=""
    var reposi_name: String=""
    var repsoi_text: String=""
    var star_icon: Boolean=false
    var git_icon: Boolean=false
    var n_git: String=""
    var n_star: String=""
    var img_icon: Boolean=false

fun build() : Git= Git(user_name, sobre_name, reposi_name, repsoi_text, star_icon, git_icon, n_git, n_star, img_icon)

}

fun git(block: GitBuilder.()-> Unit): Git=GitBuilder().apply(block).build()

fun fakeGitEmaisls()=listOf(
git {
user_name =" Victor Hugo"
    sobre_name=" Andrade Diniz de Araujo"

}
)