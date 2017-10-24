package com.flip.kotlinbook.presentation.forecastlist

import android.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.ArrayAdapter
import com.flip.kotlinbook.presentation.base.BaseView
import com.flip.kotlinbook.presentation.forecastlist.ForecastListView

class ForecastListActivity : AppCompatActivity(), Contract.View {

    private var view: ForecastListView? = null
    private val presenter: ForecastListPresenter = ForecastListPresenter(this)
    private val adapter : ForecastListAdapter = ForecastListAdapter(presenter)

    init {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        view = ForecastListView(this)

        view?.let {

            adapter.setHasStableIds(true)

            it.forecastList.layoutManager = LinearLayoutManager(this)
            it.forecastList.adapter = adapter

            it.forecastAutoComplete.setAdapter(ArrayAdapter<String>(this, R.layout.simple_dropdown_item_1line, arrayOf("abc", "123", "montre", "mo")))
            it.forecastAutoComplete.threshold = 1

            setContentView(view)
        }

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
