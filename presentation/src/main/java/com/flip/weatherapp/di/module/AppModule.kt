package com.flip.weatherapp.di.module

import com.flip.weatherapp.WeatherApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: WeatherApplication) {

    @Provides
    @Singleton
    fun providesApp() = app

}