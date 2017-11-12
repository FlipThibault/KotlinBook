package com.flip.data.entity.network

import com.google.gson.annotations.SerializedName

/**
 * Created by pthibau1 on 2017-10-17.
 */
data class Forecast(val date: Long,
                    @SerializedName("main") val temperature: Temperature,
                    val pressure: Float,
                    val humidity: Int,
                    val weather: List<Weather>,
                    val speed: Float,
                    val degree: Int,
                    val clouds: Cloud,
                    val rain: Rain)