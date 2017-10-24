package com.flip.data.forecastdatasource

import com.flip.data.model.ForecastModel

/**
 * Created by pthibau1 on 2017-10-21.
 */
class ForecastMemoryDataSourceImpl : ForecastDataSource {

    private val items = mutableListOf<ForecastModel>(
            ForecastModel("1", forecast = "a"),
            ForecastModel("2", forecast = "b"),
            ForecastModel("3", forecast = "c"),
            ForecastModel("4", forecast = "d"),
            ForecastModel("5", forecast = "e")
    )

    override fun fetchAll(callback: ForecastDataSource.MultipleItemCallback) {
        callback.onSuccess(items)
    }

    override fun fetchById(id: String, callback: ForecastDataSource.SingleItemCallback) {
        callback.onSuccess(items.first { it.id == id})
    }
}