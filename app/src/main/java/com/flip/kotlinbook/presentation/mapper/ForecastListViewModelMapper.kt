package com.flip.kotlinbook.presentation.mapper

import com.flip.kotlinbook.data.model.ForecastModel
import com.flip.kotlinbook.presentation.base.ListItemViewModel
import com.flip.kotlinbook.presentation.base.BasicListInfoCellViewModel
import com.flip.kotlinbook.presentation.base.BasicListHeaderCellViewModel
import com.flip.kotlinbook.presentation.forecastlist.ForecastListViewModel

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
            BasicListInfoCellViewModel(it.id, it.forecast)
        }.toMutableList()

        listItems.add(0, BasicListHeaderCellViewModel("Header"))

        return ForecastListViewModel(listItems)
    }

}