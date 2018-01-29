package com.flip.weatherapp.forecastlist

import com.flip.domain.fetchForecastsUseCase.FetchForcastsInteractorImpl
import com.flip.domain.fetchForecastsUseCase.FetchForecastsInteractor
import com.flip.domain.repository.ForecastRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ForecastListModule {

    @Module
    companion object {

        @Provides
        @JvmStatic
        fun provideForecastListPresenter(view : Contract.View, fetchForecastsInteractor: FetchForecastsInteractor) = ForecastListPresenter(view, fetchForecastsInteractor)

        @Provides
        @JvmStatic
        fun provideFetchForecastsInteractor(repository: ForecastRepository) : FetchForecastsInteractor {
            return FetchForcastsInteractorImpl(repository)
        }

    }

    @Binds
    abstract fun provideView(forecastListActivity: ForecastListActivity) : Contract.View

}