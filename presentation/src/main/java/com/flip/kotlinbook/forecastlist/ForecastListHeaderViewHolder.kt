package com.flip.kotlinbook.forecastlist

import com.flip.kotlinbook.base.BaseViewHolder
import com.flip.kotlinbook.base.BasicListHeaderCellVIew
import com.flip.kotlinbook.base.BasicListHeaderCellViewModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListHeaderViewHolder(val view: BasicListHeaderCellVIew) : BaseViewHolder<BasicListHeaderCellViewModel>(view) {

    override fun bindData(data: BasicListHeaderCellViewModel) {
        view.text?.text = data.text
    }

}