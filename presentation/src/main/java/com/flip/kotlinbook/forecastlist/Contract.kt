package com.flip.kotlinbook.forecastlist

import com.flip.kotlinbook.base.BasePresenter
import com.flip.kotlinbook.base.BaseView

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