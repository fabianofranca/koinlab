package com.fabianofranca.koinlab

import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.module.Module
import java.util.concurrent.atomic.AtomicBoolean

abstract class CustomModule {

    protected abstract val modules: List<Module>

    private var isLoaded = AtomicBoolean(false)

    @Synchronized
    fun load() {
        if (isLoaded.compareAndSet(false, true)) {
            loadKoinModules(modules)
        }
    }

    @Synchronized
    fun unload() {
        if (isLoaded.compareAndSet(true, false)) {
            unloadKoinModules(modules)
        }
    }
}
