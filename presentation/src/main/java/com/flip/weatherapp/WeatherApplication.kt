package com.flip.weatherapp

import android.app.Application
import com.facebook.stetho.Stetho

/**
 * Created by pthibau1 on 2017-11-12.
 */
class WeatherApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }

}