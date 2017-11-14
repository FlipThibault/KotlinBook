package com.flip.weatherapp.forecastlist

import com.flip.weatherapp.base.BaseViewHolder
import com.flip.weatherapp.base.BasicListInfoCellVIew
import com.flip.weatherapp.base.BasicListInfoCellViewModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListItemViewHolder(val view: BasicListInfoCellVIew) : BaseViewHolder<BasicListInfoCellViewModel>(view) {

    override fun bindData(data: BasicListInfoCellViewModel) {
        view.text?.text = data.text
    }

}