package com.flip.domain.fetchForecastsUseCase

import com.flip.domain.model.ForecastModel
import com.flip.domain.repository.ForecastRepository

class FetchForcastsInteractorImpl(val repository: ForecastRepository) : FetchForecastsInteractor {

    //Make this singleton managed by dagger eventually

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