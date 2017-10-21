package com.flip.kotlinbook.presentation.forecastlist

import com.flip.kotlinbook.data.datasource.forecastdatasource.ForecastMemoryDataSourceImpl
import com.flip.kotlinbook.data.models.ForecastModel
import com.flip.kotlinbook.domain.fetchForecastsUseCase.FetchForcastsInteractorImpl
import com.flip.kotlinbook.domain.fetchForecastsUseCase.FetchForecastsInteractor
import com.flip.kotlinbook.presentation.base.DataProvider
import com.flip.kotlinbook.presentation.mapper.ForecastListViewModelMapper

/**
 * Created by pthibau1 on 2017-10-18.
 */
class ForecastListPresenter(val view: Contract.View) : Contract.Presenter, DataProvider<ForecastListViewModel> {

    //should be injected
    val fetchItemsInteractor : FetchForecastsInteractor = FetchForcastsInteractorImpl(ForecastMemoryDataSourceImpl())
    val dataMapper: ForecastListViewModelMapper = ForecastListViewModelMapper()
    var viewModel: ForecastListViewModel? = null

    init {}

    override fun onCreate() {
        super.onCreate()
        fetchItemsInteractor.fetchForecasts(object: FetchForecastsInteractor.Callback {
            override fun onSuccess(forecasts: List<ForecastModel>) {
                viewModel = dataMapper.map(forecasts)
                viewModel?.let {
                    view.showData(it)
                }
            }

            override fun onFailure(error: Error) {
                view.showError()
            }
        })
    }

    override fun getData(): ForecastListViewModel {
        viewModel?.let {
            return it
        }
        return ForecastListViewModel(listOf())
    }
}