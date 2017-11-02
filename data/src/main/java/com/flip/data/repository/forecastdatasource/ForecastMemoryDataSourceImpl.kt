package com.flip.data.repository.forecastdatasource

import com.flip.data.entity.network.City
import com.flip.data.entity.network.Coordinate
import com.flip.data.entity.network.Forecast
import com.flip.data.entity.network.Temperature
import java.util.*

/**
 * Created by pthibau1 on 2017-10-21.
 */
class ForecastMemoryDataSourceImpl : ForecastDataSource {

    private val items = mutableListOf(Forecast(city = City(0, "Montreal", Coordinate(34.4F, 34.5F), "Canada", 2000000),
                                                clouds = 0,
                                                humidity = 0,
                                                date = Date().time,
                                                temperature = Temperature(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
                                                degree = 0,
                                                pressure = 0.0F,
                                                rain = 0,
                                                speed = 0.0F,
                                                weather = mutableListOf()
                                                ))

    override fun fetchAll(callback: ForecastDataSource.Callback) {
        callback.onSuccess(items)
    }

    override fun fetchByZipCode(zipCode: String, callback: ForecastDataSource.Callback) {
        throw NotImplementedError("Method not implemented for ForecastMemoryDataSource")
    }
}