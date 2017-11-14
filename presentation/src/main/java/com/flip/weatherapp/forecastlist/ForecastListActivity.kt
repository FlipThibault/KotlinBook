package com.flip.weatherapp.forecastlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.ArrayAdapter
import com.flip.weatherapp.R
import com.flip.weatherapp.base.error.ErrorView
import com.flip.weatherapp.base.error.ErrorViewModel

class ForecastListActivity : AppCompatActivity(), Contract.View {

    private var mainView: ForecastListView? = null
    private var errorView: ErrorView? = null
    private var loadingView: View? = null
    private val presenter: ForecastListPresenter = ForecastListPresenter(this)
    private val adapter : ForecastListAdapter = ForecastListAdapter(presenter)

    init {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.forecast_list_view_layout)

        mainView = findViewById(R.id.forecast_list_view_layout_view)
        errorView = findViewById(R.id.forecast_list_view_layout_error_view)
        loadingView = findViewById(R.id.forecast_list_view_layout_loading_view)

        mainView?.let {

            adapter.setHasStableIds(true)

            it.forecastList.layoutManager = LinearLayoutManager(this)
            it.forecastList.adapter = adapter

            it.forecastAutoComplete.setAdapter(ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, arrayOf("a", "ab", "abc", "1", "12", "123", "mo", "montre", "montreal", "ch", "cheese")))
            it.forecastAutoComplete.threshold = 1

        }

        presenter.onCreate()
    }

    override fun showLoading() {
        loadingView?.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        loadingView?.visibility = View.GONE
    }

    override fun showError(viewModel: ErrorViewModel) {
        errorView?.apply(viewModel)
        errorView?.visibility = View.VISIBLE
    }

    override fun hideError() {
        errorView?.visibility = View.GONE
    }

    override fun showData(viewModel: ForecastListViewModel) {
        adapter.notifyDataSetChanged()
    }
}
