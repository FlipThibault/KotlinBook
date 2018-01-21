package com.flip.weatherapp.di.module

import com.flip.data.repository.ForecastRepositoryImpl
import com.flip.domain.fetchForecastsUseCase.FetchForcastsInteractorImpl
import com.flip.domain.fetchForecastsUseCase.FetchForecastsInteractor
import com.flip.domain.repository.ForecastRepository
import com.flip.weatherapp.forecastlist.Contract
import com.flip.weatherapp.forecastlist.ForecastListPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule(val view: Contract.View) {

    @Provides
    fun providesForecastListPresenter(fetchForecastsInteractor: FetchForecastsInteractor) = ForecastListPresenter(view, fetchForecastsInteractor)

    @Provides
    @Singleton
    fun providesForecastRepository() : ForecastRepository {
        return ForecastRepositoryImpl()
    }

    @Provides
    fun providesFetchForecastsInteractor(repository: ForecastRepository) : FetchForecastsInteractor {
        return FetchForcastsInteractorImpl(repository)
    }

}