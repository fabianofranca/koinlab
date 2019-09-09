package com.fabianofranca.koinlab.repositories

import java.util.*

interface Repository {

    val description: String
        get() = this::class.java.simpleName

    val id : String
        get() = UUID.randomUUID().toString()

}