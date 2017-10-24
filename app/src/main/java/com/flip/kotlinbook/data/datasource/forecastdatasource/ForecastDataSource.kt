package com.flip.kotlinbook.data.datasource.forecastdatasource

import com.flip.kotlinbook.data.model.ForecastModel

/**
 * Created by pthibau1 on 2017-10-21.
 */
interface ForecastDataSource {

    interface MultipleItemCallback {
        fun onSuccess(forecasts : List<ForecastModel>)
        fun onFailure(error: Error)
    }

    interface SingleItemCallback {
        fun onSuccess(forecasts : ForecastModel)
        fun onFailure(error: Error)
    }

    fun fetchAll(callback: MultipleItemCallback)
    fun fetchById(id : String, callback: SingleItemCallback)
}