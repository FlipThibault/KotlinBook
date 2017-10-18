package com.flip.kotlinbook.presentation.forecastlist

import com.flip.kotlinbook.data.ForecastModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastsViewModel(val data: List<ForecastModel>) {

    fun getCount() : Int {
        return data.size
    }

}