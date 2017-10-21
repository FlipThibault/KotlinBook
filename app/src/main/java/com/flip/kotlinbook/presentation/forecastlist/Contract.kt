package com.flip.kotlinbook.presentation.forecastlist

import com.flip.kotlinbook.presentation.base.BasePresenter
import com.flip.kotlinbook.presentation.base.BaseView

/**
 * Created by pthibau1 on 2017-10-18.
 */
class Contract {

    interface View : BaseView {
        fun showData(viewModel: ForecastListViewModel)
    }

    interface Presenter : BasePresenter {

    }

}