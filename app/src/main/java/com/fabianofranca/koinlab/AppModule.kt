package com.fabianofranca.koinlab

import com.fabianofranca.koinlab.repositories.*
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.experimental.builder.*

val appModule = module {

    single { getKoin().getAll<Repository>() }

    factoryBy<RepositoryA, RepositoryAImpl>() bind Repository::class

    factoryBy<RepositoryB, RepositoryBImpl>() bind Repository::class
}