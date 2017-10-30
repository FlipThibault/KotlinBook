package com.flip.data.repository.forecastdatasource

import com.flip.data.entity.ForecastEntity
import java.lang.Error

/**
 * Created by pthibau1 on 2017-10-21.
 */
interface ForecastDataSource {

    interface MultipleItemCallback {
        fun onSuccess(forecasts : List<ForecastEntity>)
        fun onFailure(error: Error)
    }

    interface SingleItemCallback {
        fun onSuccess(forecasts : ForecastEntity)
        fun onFailure(error: Error)
    }

    fun fetchAll(callback: MultipleItemCallback)
    fun fetchById(id : String, callback: SingleItemCallback)
}