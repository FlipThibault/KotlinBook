package com.flip.data.repository.forecastdatasource

import com.flip.data.entity.network.City
import com.flip.data.entity.network.Forecast
import java.lang.Error

interface ForecastDataSource {

    interface Callback {
        fun onSuccess(city: City, forecasts : List<Forecast>)
        fun onFailure(error: Error)
    }

    fun fetchAll(callback: Callback)
    fun fetchByZipCode(zipCode : String, callback: Callback)
}