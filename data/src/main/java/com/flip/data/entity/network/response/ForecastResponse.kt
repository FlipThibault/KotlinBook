package com.flip.data.entity.network.response

import com.flip.data.entity.network.City
import com.flip.data.entity.network.Forecast

data class ForecastResponse(val city: City, val list: List<Forecast> = mutableListOf())