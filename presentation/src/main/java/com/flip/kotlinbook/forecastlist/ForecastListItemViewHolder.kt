package com.flip.kotlinbook.forecastlist

import com.flip.kotlinbook.base.BaseViewHolder
import com.flip.kotlinbook.base.BasicListInfoCellVIew
import com.flip.kotlinbook.base.BasicListInfoCellViewModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListItemViewHolder(val view: BasicListInfoCellVIew) : BaseViewHolder<BasicListInfoCellViewModel>(view) {

    override fun bindData(data: BasicListInfoCellViewModel) {
        view.text?.text = data.text
    }

}