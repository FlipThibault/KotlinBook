package com.flip.data.repository

import com.flip.data.entity.network.Forecast
import com.flip.data.mapper.ForecastEntityDataMapper
import com.flip.data.repository.forecastdatasource.ForecastDataSource
import com.flip.data.repository.forecastdatasource.ForecastMemoryDataSourceImpl
import com.flip.data.repository.forecastdatasource.ForecastNetworkDataSource
import com.flip.domain.repository.ForecastRepository
import java.lang.Error

/**
 * Created by pthibau1 on 2017-10-30.
 */
class ForecastRepositoryImpl : ForecastRepository {

    private val forecastDataSource: ForecastDataSource
    private val mapper: ForecastEntityDataMapper

    init {
        //forecastDataSource = ForecastMemoryDataSourceImpl()
        forecastDataSource = ForecastNetworkDataSource()
        mapper = ForecastEntityDataMapper()
    }

    override fun fetchForecastsByZipCode(zipCode: String, callback: ForecastRepository.Callback) {
        forecastDataSource.fetchByZipCode(zipCode, object: ForecastDataSource.Callback {
            override fun onSuccess(forecasts: List<Forecast>) {
                callback.onSuccess(forecasts = mapper.mapEntityToDomain(forecasts))
            }

            override fun onFailure(error: Error) {
                callback.onFailure(error)
            }
        })
    }

}