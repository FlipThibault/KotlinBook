package com.flip.weatherapp.di

import android.app.Application
import android.content.Context
import com.flip.weatherapp.WeatherApplication
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    internal abstract fun provideContext(application: Application): Context

}