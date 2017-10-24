package forecastlist

import base.BaseViewHolder
import base.BasicListInfoCellVIew
import base.BasicListInfoCellViewModel

/**
 * Created by pthibau1 on 2017-10-17.
 */
class ForecastListItemViewHolder(val view: BasicListInfoCellVIew) : BaseViewHolder<BasicListInfoCellViewModel>(view) {

    override fun bindData(data: BasicListInfoCellViewModel) {
        view.text?.text = data.text
    }

}