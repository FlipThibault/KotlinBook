package com.flip.data.repository

import com.flip.domain.repository.ForecastRepository

class ForecastRepositoryFactory {

    fun createRepository() : ForecastRepository {
        return ForecastRepositoryImpl()
    }

}