package forecastlist

import base.BaseViewHolder
import base.BasicListHeaderCellVIew
import base.BasicListHeaderCellViewModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListHeaderViewHolder(val view: BasicListHeaderCellVIew) : BaseViewHolder<BasicListHeaderCellViewModel>(view) {

    override fun bindData(data: BasicListHeaderCellViewModel) {
        view.text?.text = data.text
    }

}