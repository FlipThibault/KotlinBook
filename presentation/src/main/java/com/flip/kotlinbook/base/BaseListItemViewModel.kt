package com.flip.kotlinbook.base

/**
 * Created by pthibau1 on 2017-10-19.
 */
interface BaseListItemViewModel {
    fun isSwipeableLtr(): Boolean
    fun isSwipeableRtl(): Boolean
    fun isTappable(): Boolean
    fun isDraggable(): Boolean
}