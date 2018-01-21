package com.flip.weatherapp.base

import java.util.*

class BasicListHeaderCellViewModel(val text: String = "") : ListItemViewModel, Identifiable<String> {

    override fun getIdentifier(): String {
        return Random().nextLong().toString()
    }

}