package com.example.dagger2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private  val component : ApplicationComponent? by lazy {
        DaggerApplicationComponent.builder().build()
    }

    @Inject
    lateinit var house: House

    @Inject
    lateinit var window: Window

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component?.inject(this)
    }

    override fun onResume() {
        super.onResume()
        mainTextView.text = house.people.name
        Log.d("HelpMe", window.glass.color)
    }
}