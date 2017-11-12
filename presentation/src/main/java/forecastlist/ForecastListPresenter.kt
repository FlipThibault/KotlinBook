package forecastlist

import base.DataProvider
import base.error.ErrorViewActionDelegate
import base.error.ErrorViewModel
import base.error.ErrorViewModelImpl
import com.flip.data.repository.ForecastRepositoryImpl
import mapper.ForecastListViewModelMapper
import com.flip.domain.fetchForecastsUseCase.FetchForcastsInteractorImpl
import com.flip.domain.fetchForecastsUseCase.FetchForecastsInteractor
import com.flip.domain.model.ForecastModel
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread

/**
 * Created by pthibau1 on 2017-10-18.
 */
class ForecastListPresenter(val view: Contract.View) : Contract.Presenter, DataProvider<ForecastListViewModel>, ErrorViewActionDelegate {

    //should be injected
    val fetchItemsInteractor : FetchForecastsInteractor = FetchForcastsInteractorImpl(ForecastRepositoryImpl())
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