package com.flip.weatherapp.forecastlist

import com.flip.data.repository.ForecastRepositoryImpl
import com.flip.domain.fetchForecastsUseCase.FetchForcastsInteractorImpl
import com.flip.weatherapp.base.DataProvider
import com.flip.weatherapp.base.error.ErrorViewActionDelegate
import com.flip.weatherapp.base.error.ErrorViewModelImpl
import com.flip.weatherapp.mapper.ForecastListViewModelMapper
import com.flip.domain.fetchForecastsUseCase.FetchForecastsInteractor
import com.flip.domain.model.ForecastModel
import com.flip.weatherapp.di.PerActivity
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread

@PerActivity
class ForecastListPresenter(val view: Contract.View, val fetchItemsInteractor: FetchForecastsInteractor) : Contract.Presenter, DataProvider<ForecastListViewModel>, ErrorViewActionDelegate {

    val dataMapper: ForecastListViewModelMapper = ForecastListViewModelMapper()
    var viewModel: ForecastListViewModel? = null

    init {}

    override fun onCreate() {
        super.onCreate()
        performFetch()
    }

    fun performFetch() {
        view.hideError()
        view.showLoading()
        async {
            fetchItemsInteractor.fetchForecastsByZipCode("94043", object : FetchForecastsInteractor.Callback {
                override fun onSuccess(forecasts: List<ForecastModel>) {
                    uiThread {
                        viewModel = dataMapper.map(forecasts)
                        viewModel?.let {
                            view.hideLoading()
                            view.hideError()
                            view.showData(it)
                        }
                    }
                }

                override fun onFailure(error: Error) {
                    uiThread {
                        view.hideLoading()
                        view.showError(ErrorViewModelImpl(error.message.toString(), "Retry", this@ForecastListPresenter))
                    }
                }
            })
        }
    }

    // DataProvider

    override fun getData(): ForecastListViewModel {
        viewModel?.let {
            return it
        }
        return ForecastListViewModel(listOf())
    }

    // ErrorViewActionDelegate

    override fun onButtonClick() {
        performFetch()
    }
}