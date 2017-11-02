package com.flip.domain.fetchForecastsUseCase

import com.flip.domain.model.ForecastModel
import com.flip.domain.repository.ForecastRepository

/**
 * Created by pthibau1 on 2017-10-21.
 */
class FetchForcastsInteractorImpl(val repository: ForecastRepository) : FetchForecastsInteractor {

    override fun fetchForecastsByZipCode(zipCode: String, callback: FetchForecastsInteractor.Callback) {
        repository.fetchForecastsByZipCode(zipCode, object:ForecastRepository.Callback {
            override fun onSuccess(forecasts: List<ForecastModel>) {
                callback.onSuccess(forecasts)
            }

            override fun onFailure(error: Error) {
                callback.onFailure(error)
            }
        })
    }
}