package com.flip.weatherapp.di

import com.flip.data.repository.ForecastRepositoryImpl
import com.flip.domain.repository.ForecastRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideForecastRepository() : ForecastRepository {
        return ForecastRepositoryImpl()
    }

}