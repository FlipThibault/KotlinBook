package com.flip.data.repository.forecastdatasource

import com.flip.data.entity.network.Forecast
import java.lang.Error

/**
 * Created by pthibau1 on 2017-10-21.
 */
interface ForecastDataSource {

    interface Callback {
        fun onSuccess(forecasts : List<Forecast>)
        fun onFailure(error: Error)
    }

    fun fetchAll(callback: Callback)
    fun fetchByZipCode(zipCode : String, callback: Callback)
}