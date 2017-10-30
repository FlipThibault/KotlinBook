package com.flip.data.repository

import com.flip.domain.repository.ForecastRepository

/**
 * Created by pthibau1 on 2017-10-30.
 */
class ForecastRepositoryFactory {

    fun createRepository() : ForecastRepository {
        return ForecastRepositoryImpl()
    }

}