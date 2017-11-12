package com.flip.data.entity.network

/**
 * Created by pthibau1 on 2017-11-11.
 */
data class ForecastMain(val temp: Double,
                        val temp_min: Double,
                        val temp_max: Double,
                        val pressure: Double,
                        val sea_level: Double,
                        val grnd_level: Double,
                        val humidity: Double,
                        val temp_kf: Double)