package com.flip.weatherapp.di.component

import com.flip.weatherapp.di.module.PresenterModule
import com.flip.weatherapp.forecastlist.ForecastListActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by FlipThibault on 2018-01-21.
 */
@Singleton
@Component(modules = arrayOf(PresenterModule::class))
interface PresenterComponent {

    fun inject(forecastListView: ForecastListActivity)

}