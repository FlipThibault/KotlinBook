package forecastlist

import base.DataProvider
import com.flip.domain.fetchForecastsUseCase.FetchForcastsInteractorImpl
import mapper.ForecastListViewModelMapper
import com.flip.domain.fetchForecastsUseCase.FetchForecastsInteractor
import com.flip.domain.model.ForecastModel
import com.flip.data.forecastdatasource.ForecastMemoryDataSourceImpl
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