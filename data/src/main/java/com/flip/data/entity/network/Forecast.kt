package com.flip.data.entity.network

/**
 * Created by pthibau1 on 2017-10-17.
 */
data class Forecast(val city: City,
                    val date: Long,
                    val temperature: Temperature,
                    val pressure: Float,
                    val humidity: Int,
                    val weather: List<Weather>,
                    val speed: Float,
                    val degree: Int,
                    val clouds: Int,
                    val rain: Int)