package com.flip.data.repository.forecastdatasource

import com.flip.data.mapper.ForecastEntityDataMapper
import com.flip.data.request.ForecastRequest

/**
 * Created by pthibau1 on 2017-11-01.
 */
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
            callback.onSuccess(mapper.mapResponseToEntity(it))
            return
        }

        callback.onFailure(Error("Could not fetch data"))
    }
}