package com.flip.weatherapp.mapper

import com.flip.domain.model.ForecastModel
import com.flip.weatherapp.base.ListItemViewModel
import com.flip.weatherapp.base.BasicListInfoCellViewModel
import com.flip.weatherapp.base.BasicListHeaderCellViewModel
import com.flip.weatherapp.forecastlist.ForecastListViewModel

/**
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