package com.flip.kotlinbook.presentation.base

import com.flip.kotlinbook.presentation.base.Identifiable
import com.flip.kotlinbook.presentation.base.ListItemViewModel
import java.util.*

/**
 * Created by pthibau1 on 2017-10-18.
 */
class BasicListHeaderCellViewModel(val text: String = "") : ListItemViewModel, Identifiable<String> {

    override fun getIdentifier(): String {
        return Random().nextLong().toString()
    }

}