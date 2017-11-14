package com.flip.kotlinbook.mapper

import com.flip.domain.model.ForecastModel
import com.flip.kotlinbook.base.ListItemViewModel
import com.flip.kotlinbook.base.BasicListInfoCellViewModel
import com.flip.kotlinbook.base.BasicListHeaderCellViewModel
import com.flip.kotlinbook.forecastlist.ForecastListViewModel

/**
 * Created by pthibau1 on 2017-10-19.
 *
 * Map the forecast Data Model to ForecastListViewModel
 *
 * This class contains methods which prepare the data to be consumed by the view.
 * Ex: the items should all be in order they want to be displayed in a list. It can also insert headers where necessary for example.
 */
class ForecastListViewModelMapper {

    fun map(dataModels: Collection<ForecastModel>) : ForecastListViewModel {
        val listItems : MutableList<ListItemViewModel> = dataModels.map {
            BasicListInfoCellViewModel(it.description)
        }.toMutableList()

        listItems.add(0, BasicListHeaderCellViewModel("Header"))

        return ForecastListViewModel(listItems)
    }

}