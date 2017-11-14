package com.flip.kotlinbook

import android.app.Application
import com.facebook.stetho.Stetho
import com.flip.kotlinbook.BuildConfig

/**
 * Created by pthibau1 on 2017-11-12.
 */
class ForecastApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)
    }

}