package com.flip.kotlinbook.presentation.base

import com.flip.kotlinbook.presentation.base.Identifiable

/**
 * Created by pthibau1 on 2017-10-20.
 *
 * Basic cell actions
 */
interface ListItemViewModel : Identifiable<String> {
    //try not to use these...
//    fun isSwipeableLtr(): Boolean
//    fun isSwipeableRtl(): Boolean
//    fun isTappable(): Boolean
//    fun isLongPressable() : Boolean
//    fun isDraggable(): Boolean
}