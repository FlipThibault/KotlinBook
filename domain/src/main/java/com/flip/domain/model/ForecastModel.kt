package com.flip.domain.model

data class ForecastModel(val city: String,
                         val country: String,
                         val date: String,
                         val description: String,
                         val high: Int,
                         val low: Int)