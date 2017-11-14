package com.flip.weatherapp.forecastlist

import com.flip.weatherapp.base.BaseViewHolder
import com.flip.weatherapp.base.BasicListHeaderCellVIew
import com.flip.weatherapp.base.BasicListHeaderCellViewModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListHeaderViewHolder(val view: BasicListHeaderCellVIew) : BaseViewHolder<BasicListHeaderCellViewModel>(view) {

    override fun bindData(data: BasicListHeaderCellViewModel) {
        view.text?.text = data.text
    }

}