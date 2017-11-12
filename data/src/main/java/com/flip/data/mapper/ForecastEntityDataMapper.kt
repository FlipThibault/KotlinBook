package com.flip.data.mapper

import com.flip.data.entity.network.City
import com.flip.data.entity.network.Forecast
import com.flip.domain.model.ForecastModel
import java.text.DateFormat
import java.util.*

/**
 * Created by pthibau1 on 2017-11-01.
 */
class ForecastEntityDataMapper {

    fun mapEntityToDomain(city: City, forecastEntities: List<Forecast>) : List<ForecastModel> {

        return forecastEntities.map { forecastEntity ->
            ForecastModel(
                    city.name,
                    city.country,
                    convertDate(forecastEntity.date),
                    forecastEntity.weather[0].description,
                    forecastEntity.temperature.temp_max.toInt(),
                    forecastEntity.temperature.temp_min.toInt()
            )
        }

    }

    private fun convertDate(date: Long) : String {
        val dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return dateFormat.format(date * 1000)
    }

}