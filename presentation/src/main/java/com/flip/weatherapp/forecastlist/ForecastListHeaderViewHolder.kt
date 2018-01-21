package com.flip.weatherapp.forecastlist

import com.flip.weatherapp.base.BaseViewHolder
import com.flip.weatherapp.base.BasicListHeaderCellVIew
import com.flip.weatherapp.base.BasicListHeaderCellViewModel

class ForecastListHeaderViewHolder(val view: BasicListHeaderCellVIew) : BaseViewHolder<BasicListHeaderCellViewModel>(view) {

    override fun bindData(data: BasicListHeaderCellViewModel) {
        view.text?.text = data.text
    }

}