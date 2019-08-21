package com.fabianofranca.koinlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fabianofranca.koinlab.repositories.Repository
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val repositories: List<Repository> by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        repositories.forEach {
            val text = if (txtHello.text.isEmpty())
                it.description()
            else
                "${txtHello.text}\n${it.description()}"

            txtHello.text = text
        }
    }
}
