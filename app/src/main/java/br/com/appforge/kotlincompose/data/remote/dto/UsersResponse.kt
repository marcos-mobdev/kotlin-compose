package br.com.appforge.kotlincompose.data.remote.dto

data class UsersResponse(
    val limit: Int,
    val skip: Int,
    val total: Int,
    val users: List<User>
)