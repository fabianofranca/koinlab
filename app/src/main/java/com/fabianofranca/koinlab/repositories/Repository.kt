package com.fabianofranca.koinlab.repositories

interface Repository {
    fun description() = this::class.java.simpleName
}