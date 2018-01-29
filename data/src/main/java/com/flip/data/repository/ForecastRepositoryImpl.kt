package com.flip.data.repository

import android.util.Log
import com.flip.data.entity.network.City
import com.flip.data.entity.network.Forecast
import com.flip.data.mapper.ForecastEntityDataMapper
import com.flip.data.repository.forecastdatasource.ForecastDataSource
import com.flip.data.repository.forecastdatasource.ForecastNetworkDataSource
import com.flip.domain.repository.ForecastRepository
import java.lang.Error
import javax.inject.Singleton

@Singleton
class ForecastRepositoryImpl : ForecastRepository {

    private val forecastDataSource: ForecastDataSource
    private val mapper: ForecastEntityDataMapper
    private var count = 0

    init {
        forecastDataSource = ForecastNetworkDataSource()
        mapper = ForecastEntityDataMapper()
    }

    override fun fetchForecastsByZipCode(zipCode: String, callback: ForecastRepository.Callback) {
        count += 1
        Log.d("COUNT_FORECAST", count.toString())
        forecastDataSource.fetchByZipCode(zipCode, object: ForecastDataSource.Callback {
            override fun onSuccess(city: City, forecasts: List<Forecast>) {
                callback.onSuccess(forecasts = mapper.mapEntityToDomain(city, forecasts))
            }

            override fun onFailure(error: Error) {
                callback.onFailure(error)
            }
        })
    }

}