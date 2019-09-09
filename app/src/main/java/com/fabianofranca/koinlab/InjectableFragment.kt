package com.fabianofranca.koinlab

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class InjectableFragment: Fragment() {

    protected abstract val modules: CustomModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        modules.load()
    }

}