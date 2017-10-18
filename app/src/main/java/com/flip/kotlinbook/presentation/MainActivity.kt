package com.flip.kotlinbook.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.flip.kotlinbook.presentation.forecastlist.ForecastListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(ForecastListView(this))
    }
}
