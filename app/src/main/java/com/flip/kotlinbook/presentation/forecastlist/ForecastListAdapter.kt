package com.flip.kotlinbook.presentation.forecastlist

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.flip.kotlinbook.presentation.DataProvider

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListAdapter(val dataProvider: DataProvider<ForecastsViewModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        val STANDARD_CELL_VIEW_TYPE = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ForecastItemViewHolder(TextView(parent?.context))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder is ForecastItemViewHolder).let { forecastHolder ->
//            dataProvider.textView.text = items[position]
        }
    }

    override fun getItemCount(): Int = dataProvider.getData().getCount()

    override fun getItemViewType(position: Int): Int {
        return STANDARD_CELL_VIEW_TYPE
    }
}