package com.flip.data.repository.forecastdatasource

import com.flip.data.entity.network.*
import java.util.*

class ForecastMemoryDataSource : ForecastDataSource {

    private val city = City(0, "Montreal", Coordinate(34.4F, 34.5F), "Canada", 2000000)
    private val items = mutableListOf(Forecast(clouds = Cloud(0),
                                               humidity = 0,
                                               date = Date().time,
                                               temperature = Temperature(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
                                               degree = 0,
                                               pressure = 0.0F,
                                               rain = Rain(0.0F),
                                               speed = 0.0F,
                                               weather = mutableListOf()
                                               ))

    override fun fetchAll(callback: ForecastDataSource.Callback) {
        callback.onSuccess(city, items)
    }

    override fun fetchByZipCode(zipCode: String, callback: ForecastDataSource.Callback) {
        throw NotImplementedError("Method not implemented for ForecastMemoryDataSource")
    }
}