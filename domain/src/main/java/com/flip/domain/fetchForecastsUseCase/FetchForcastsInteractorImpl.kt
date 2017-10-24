package com.flip.domain.fetchForecastsUseCase

import com.flip.kotlinbook.data.datasource.forecastdatasource.ForecastDataSource
import com.flip.kotlinbook.data.model.ForecastModel

/**
 * Created by pthibau1 on 2017-10-21.
 */
class FetchForcastsInteractorImpl(val dataSource: ForecastDataSource) : FetchForecastsInteractor {

    override fun fetchForecasts(callback: FetchForecastsInteractor.Callback) {
        dataSource.fetchAll(object:ForecastDataSource.MultipleItemCallback {
            override fun onSuccess(forecasts: List<ForecastModel>) {
                callback.onSuccess(forecasts)
            }

            override fun onFailure(error: Error) {
                callback.onFailure(error)
            }
        })
    }

}