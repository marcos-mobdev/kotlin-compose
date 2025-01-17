package br.com.appforge.kotlincompose.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.appforge.kotlincompose.data.remote.dto.User
import br.com.appforge.kotlincompose.data.remote.repository.IUserRepository
import br.com.appforge.kotlincompose.data.remote.repository.UserRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel@Inject constructor(
    private val userRepository: IUserRepository
) : ViewModel(){

    private val _users = MutableLiveData<List<User>>()
    val users:LiveData<List<User>>
        get() = _users

    fun getUsers(){
        viewModelScope.launch {
            val listUsers = userRepository.getUsers()
            _users.postValue(listUsers)
        }
    }
}