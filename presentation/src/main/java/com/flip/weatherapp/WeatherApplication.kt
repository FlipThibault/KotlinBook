package com.flip.weatherapp

import android.app.Application
import com.facebook.stetho.Stetho
import com.flip.weatherapp.di.component.ApplicationComponent
import com.flip.weatherapp.di.component.DaggerApplicationComponent
import com.flip.weatherapp.di.module.AppModule

class WeatherApplication : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()

        component.inject(this)

        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }

}