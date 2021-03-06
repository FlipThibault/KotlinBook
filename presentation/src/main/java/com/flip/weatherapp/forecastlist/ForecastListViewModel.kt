package com.flip.weatherapp.forecastlist

import com.flip.weatherapp.base.BasicListHeaderCellViewModel
import com.flip.weatherapp.base.ListItemViewModel
import com.flip.weatherapp.base.ListViewModel

/**
 * Should be a direct model representation of the data in the list (with headers, sort applied, etc)
 */
class ForecastListViewModel(val items : List<ListItemViewModel>) : ListViewModel {

    companion object {
        val STANDARD_CELL_VIEW_TYPE = 0
        val HEADER_CELL_VIEW_TYPE = 1
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun getItemViewType(position: Int): Int {
        return if(items[position] is BasicListHeaderCellViewModel) {
            HEADER_CELL_VIEW_TYPE
        } else {
            STANDARD_CELL_VIEW_TYPE
        }
    }

    override fun getListItems(): List<ListItemViewModel> {
        return items
    }

    override fun getItem(position: Int): ListItemViewModel {
        return items.get(position)
    }
}