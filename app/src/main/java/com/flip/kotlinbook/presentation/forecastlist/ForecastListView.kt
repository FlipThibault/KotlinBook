package com.flip.kotlinbook.presentation.forecastlist

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import com.flip.kotlinbook.R

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListView(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : ConstraintLayout(context, attrs, defStyle), Contract.View {

    val forcastList: RecyclerView

    init {
        inflate(context, R.layout.forecast_list_view, this)

        forcastList = findViewById(R.id.forecast_list)
        forcastList.layoutManager = LinearLayoutManager(context)
    }
}