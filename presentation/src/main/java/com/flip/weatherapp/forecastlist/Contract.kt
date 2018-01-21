package com.flip.weatherapp.forecastlist

import com.flip.weatherapp.base.BasePresenter
import com.flip.weatherapp.base.BaseView

class Contract {

    interface View : BaseView {
        fun showData(viewModel: ForecastListViewModel)
    }

    interface Presenter : BasePresenter {

    }

}