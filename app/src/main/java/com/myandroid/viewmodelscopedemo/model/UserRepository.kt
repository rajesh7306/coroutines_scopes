package com.myandroid.viewmodelscopedemo.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers() : List<User>{
           delay(8000)
           val users : List<User> = listOf(
               User(1,"Sam"),
               User(2,"aravind"),
               User(3,"yaswanth"),
               User(4,"bhanu")

           )
        return users

    }
}