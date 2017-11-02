package com.flip.data.mapper

import com.flip.data.entity.network.Forecast
import com.flip.data.response.ForecastResponse
import com.flip.domain.model.ForecastModel
import java.text.DateFormat
import java.util.*

/**
 * Created by pthibau1 on 2017-11-01.
 */
class ForecastEntityDataMapper {

    fun mapResponseToEntity(forecastResponse: ForecastResponse) : List<Forecast> {

        return forecastResponse.list.map { response ->
            Forecast(
                    city = response.city,
                    weather = response.weather,
                    speed = response.speed,
                    rain = response.rain,
                    pressure = response.pressure,
                    degree = response.degree,
                    temperature = response.temperature,
                    date = response.date,
                    humidity = response.humidity,
                    clouds = response.clouds
            )
        }

    }

    fun mapEntityToDomain(forecastEntities: List<Forecast>) : List<ForecastModel> {

        return forecastEntities.map { forecastEntity ->
            ForecastModel(
                    forecastEntity.city.name,
                    forecastEntity.city.country,
                    convertDate(forecastEntity.date),
                    forecastEntity.weather[0].description,
                    forecastEntity.temperature.max.toInt(),
                    forecastEntity.temperature.min.toInt()
            )
        }

    }

    private fun convertDate(date: Long) : String {
        val dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return dateFormat.format(date * 1000)
    }

}