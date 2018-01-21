package com.flip.weatherapp.di.component

import com.flip.weatherapp.di.module.PresenterModule
import com.flip.weatherapp.forecastlist.ForecastListActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(PresenterModule::class))
interface PresenterComponent {

    fun inject(forecastListView: ForecastListActivity)

}