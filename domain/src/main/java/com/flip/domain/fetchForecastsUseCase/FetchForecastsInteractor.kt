package com.flip.domain.fetchForecastsUseCase

import com.flip.domain.model.ForecastModel

interface FetchForecastsInteractor {

    interface Callback {
        fun onSuccess(forecasts : List<ForecastModel>)
        fun onFailure(error: Error)
    }

    fun fetchForecastsByZipCode(zipCode: String, callback: Callback)

}