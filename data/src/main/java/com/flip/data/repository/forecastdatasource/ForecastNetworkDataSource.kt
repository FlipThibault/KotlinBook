package com.flip.data.repository.forecastdatasource

import com.flip.data.mapper.ForecastEntityDataMapper
import com.flip.data.entity.network.request.ForecastRequest

class ForecastNetworkDataSource : ForecastDataSource {

    val forecastRequest: ForecastRequest
    val mapper: ForecastEntityDataMapper

    init {
        forecastRequest = ForecastRequest()
        mapper = ForecastEntityDataMapper()
    }

    override fun fetchAll(callback: ForecastDataSource.Callback) {
        throw NotImplementedError("Method not implemented for ForecastNetworkDataSource")
    }

    override fun fetchByZipCode(zipCode: String, callback: ForecastDataSource.Callback) {
        forecastRequest.zipCode = zipCode

        forecastRequest.execute()?.let {
            callback.onSuccess(it.city, it.list)
            return
        }

        callback.onFailure(Error("Could not fetch data"))
    }
}