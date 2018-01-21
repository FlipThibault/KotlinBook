package com.flip.weatherapp.di.component

import com.flip.weatherapp.WeatherApplication
import com.flip.weatherapp.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface ApplicationComponent {

    fun inject(app: WeatherApplication)

}