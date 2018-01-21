package com.flip.weatherapp.base

/**
 * Used in order to pass abstractions to the recycler view adapter
 */
interface ListViewModel {

    fun getItemCount(): Int
    fun getItemViewType(position: Int): Int
    fun getListItems(): List<ListItemViewModel>
    fun getItem(position: Int): ListItemViewModel

}