package com.flip.data.entity.network

data class Temperature(val temp: Float,
                       val temp_min: Float,
                       val temp_max: Float,
                       val pressure: Float,
                       val sea_level: Float,
                       val grnd_level: Float,
                       val humidity: Float,
                       val temp_kf: Float)