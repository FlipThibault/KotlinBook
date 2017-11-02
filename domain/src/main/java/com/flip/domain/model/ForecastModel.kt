package com.flip.domain.model

/**
 * Created by pthibau1 on 2017-10-17.
 */
data class ForecastModel(val city: String,
                         val country: String,
                         val date: String,
                         val description: String,
                         val high: Int,
                         val low: Int)