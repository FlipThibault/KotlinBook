package com.flip.domain.fetchForecastsUseCase

import com.flip.domain.model.ForecastModel

/**
 * Created by pthibau1 on 2017-10-21.
 */
interface FetchForecastsInteractor {

    interface Callback {
        fun onSuccess(forecasts : List<ForecastModel>)
        fun onFailure(error: Error)
    }

    fun fetchForecastsByZipCode(zipCode: String, callback: Callback)

}