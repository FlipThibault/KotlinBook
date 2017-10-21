package com.flip.kotlinbook.presentation.forecastlist

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.flip.kotlinbook.R

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListView(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : ConstraintLayout(context, attrs, defStyle), Contract.View {

    val forecastList: RecyclerView
    val forecastAutoComplete: AutoCompleteTextView
    val presenter: ForecastListPresenter
    val adapter : ForecastListAdapter

    init {
        inflate(context, R.layout.forecast_list_view, this)

        forecastList = findViewById(R.id.forecast_list)
        forecastAutoComplete = findViewById(R.id.forecast_autocomplete)

        presenter = ForecastListPresenter(this)

        adapter = ForecastListAdapter(presenter)
        adapter.setHasStableIds(true)

        forecastList.layoutManager = LinearLayoutManager(context)
        forecastList.adapter = adapter

        forecastAutoComplete.setAdapter(ArrayAdapter<String>(this.context, android.R.layout.simple_dropdown_item_1line, arrayOf("abc", "123", "montre", "mo")))
        forecastAutoComplete.threshold = 1
    }

    fun notifyOnCreate() {
        presenter.onCreate()
    }

    override fun showLoading() {
        super.showLoading()
    }

    override fun hideLoading() {
        super.hideLoading()
    }

    override fun showError() {
        super.showError()
    }

    override fun showData(viewModel: ForecastListViewModel) {
        adapter.notifyDataSetChanged()
    }
}