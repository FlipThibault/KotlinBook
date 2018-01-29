package com.flip.weatherapp

import com.facebook.stetho.Stetho
import com.flip.weatherapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class WeatherApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}