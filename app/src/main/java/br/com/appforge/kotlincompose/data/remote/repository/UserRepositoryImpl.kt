package br.com.appforge.kotlincompose.data.remote.repository

import br.com.appforge.kotlincompose.data.remote.api.DummyAPI
import br.com.appforge.kotlincompose.data.remote.dto.User
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val dummyAPI: DummyAPI
): IUserRepository{
    override suspend fun getUsers(): List<User> {
        try {
            val response =  dummyAPI.getUsers()
            if(response.isSuccessful && response.body() != null){
                val usersList = response.body()?.users
                if(usersList!= null){
                    return usersList
                }
            }
        }catch (getUsersException: Exception){
            getUsersException.printStackTrace()
        }
        return emptyList()
    }

}