package br.com.appforge.kotlincompose.data.remote.api

import br.com.appforge.kotlincompose.data.remote.dto.UsersResponse
import retrofit2.Response
import retrofit2.http.GET

interface DummyAPI {
    @GET("users")
    suspend fun getUsers(): Response<UsersResponse>
}