package com.flip.kotlinbook.presentation.base

/**
 * Created by pthibau1 on 2017-10-20.
 *
 * Used in order to pass abstractions to the recycler view adapter
 */
interface ListViewModel {

    fun getItemCount(): Int
    fun getItemViewType(position: Int): Int
    fun getListItems(): List<ListItemViewModel>
    fun getItem(position: Int): ListItemViewModel

}