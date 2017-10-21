package com.flip.kotlinbook.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.flip.kotlinbook.presentation.forecastlist.ForecastListView

class MainActivity : AppCompatActivity() {

    var view: ForecastListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        view = ForecastListView(this)

        setContentView(view)

        view?.notifyOnCreate()
    }
}
