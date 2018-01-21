package com.flip.weatherapp.base

import java.util.*

class BasicListInfoCellViewModel(val text: String = "") : ListItemViewModel, Identifiable<String> {

    override fun getIdentifier(): String {
        return UUID.randomUUID().toString()
    }

}