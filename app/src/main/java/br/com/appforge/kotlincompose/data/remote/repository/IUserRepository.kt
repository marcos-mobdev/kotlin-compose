package br.com.appforge.kotlincompose.data.remote.repository

import br.com.appforge.kotlincompose.data.remote.dto.User

interface IUserRepository {
    suspend fun getUsers():List<User>
}