package com.flip.kotlinbook.presentation.base

/**
 * Created by pthibau1 on 2017-10-18.
 *  Some base methods that should be implemented by most views
 */
interface BaseView {
    fun showLoading() {}
    fun hideLoading() {}

    fun showError() {}
}