package com.flip.weatherapp.di

import com.flip.weatherapp.forecastlist.ForecastListActivity
import com.flip.weatherapp.forecastlist.ForecastListModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(ForecastListModule::class))
    abstract fun forecastListActivity(): ForecastListActivity

}