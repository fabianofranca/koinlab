package com.fabianofranca.koinlab

import com.fabianofranca.koinlab.repositories.*
import org.koin.core.module.Module

object SampleModule : CustomModule() {

    override val modules by lazy { listOf(module) }

    private val module: Module = org.koin.dsl.module {

        single { RepositoryBImpl() }

    }
}