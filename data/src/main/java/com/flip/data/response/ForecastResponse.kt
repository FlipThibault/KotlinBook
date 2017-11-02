package com.flip.data.response

import com.flip.data.entity.network.City
import com.flip.data.entity.network.Forecast

/**
 * Created by pthibau1 on 2017-11-01.
 */
data class ForecastResponse(val city: City? = null, val list: List<Forecast> = mutableListOf())