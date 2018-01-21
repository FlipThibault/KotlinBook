package com.flip.weatherapp.forecastlist

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.widget.AutoCompleteTextView
import com.flip.weatherapp.R

class ForecastListView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {

    val forecastList: RecyclerView
    val forecastAutoComplete: AutoCompleteTextView

    init {
        val root  = inflate(context, R.layout.forecast_list_view, this)

        forecastList = root.findViewById(R.id.forecast_list)
        forecastAutoComplete = root.findViewById(R.id.forecast_autocomplete)
    }

}