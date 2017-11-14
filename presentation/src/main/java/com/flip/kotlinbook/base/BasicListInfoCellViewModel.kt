package com.flip.kotlinbook.base

import java.util.*

/**
 * Created by pthibau1 on 2017-10-18.
 *
 */
class BasicListInfoCellViewModel(val text: String = "") : ListItemViewModel, Identifiable<String> {

    override fun getIdentifier(): String {
        return UUID.randomUUID().toString()
    }

}