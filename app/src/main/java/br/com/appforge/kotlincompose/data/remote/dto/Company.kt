package br.com.appforge.kotlincompose.data.remote.dto

data class Company(
    val address: Address,
    val department: String,
    val name: String,
    val title: String
)