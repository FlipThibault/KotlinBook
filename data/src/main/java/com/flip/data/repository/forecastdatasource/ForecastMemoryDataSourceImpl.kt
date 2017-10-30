package com.flip.data.repository.forecastdatasource

import com.flip.data.entity.ForecastEntity

/**
 * Created by pthibau1 on 2017-10-21.
 */
class ForecastMemoryDataSourceImpl : ForecastDataSource {

    private val items = mutableListOf<ForecastEntity>(
            ForecastEntity("1", forecast = "a"),
            ForecastEntity("2", forecast = "b"),
            ForecastEntity("3", forecast = "c"),
            ForecastEntity("4", forecast = "d"),
            ForecastEntity("5", forecast = "e")
    )

    override fun fetchAll(callback: ForecastDataSource.MultipleItemCallback) {
        callback.onSuccess(items)
    }

    override fun fetchById(id: String, callback: ForecastDataSource.SingleItemCallback) {
        callback.onSuccess(items.first { it.id == id})
    }
}