package com.flip.data.entity.network

/**
 * Created by pthibau1 on 2017-11-01.
 */
data class Temperature(val temp: Float,
                       val temp_min: Float,
                       val temp_max: Float,
                       val pressure: Float,
                       val sea_level: Float,
                       val grnd_level: Float,
                       val humidity: Float,
                       val temp_kf: Float)