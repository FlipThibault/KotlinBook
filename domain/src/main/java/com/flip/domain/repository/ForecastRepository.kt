package com.flip.domain.repository

import com.flip.domain.model.ForecastModel

interface ForecastRepository {

    interface Callback {
        fun onSuccess(forecasts : List<ForecastModel>)
        fun onFailure(error: Error)
    }

    fun fetchForecastsByZipCode(zipCode: String, callback: Callback)

}