package com.fabianofranca.koinlab


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fabianofranca.koinlab.repositories.RepositoryB
import kotlinx.android.synthetic.main.fragment_sample.view.*
import org.koin.android.ext.android.inject

class SampleFragment : InjectableFragment() {

    override val modules: CustomModule = SampleModule

    private val repository: RepositoryB by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sample, container, false)

        view.sampleText.text =  repository.id
        return view
    }
}
