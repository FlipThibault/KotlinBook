package com.flip.domain.repository

import com.flip.domain.model.ForecastModel

/**
 * Created by pthibau1 on 2017-10-30.
 */
interface ForecastRepository {

    interface Callback {
        fun onSuccess(forecasts : List<ForecastModel>)
        fun onFailure(error: Error)
    }

    fun fetchForecasts(callback: Callback)

}