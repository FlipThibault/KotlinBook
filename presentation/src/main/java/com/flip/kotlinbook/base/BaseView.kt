package com.flip.kotlinbook.base

import com.flip.kotlinbook.base.error.ErrorViewModel

/**
 * Created by pthibau1 on 2017-10-18.
 *  Some com.flip.kotlinbook.base methods that should be implemented by most views
 */
interface BaseView {
    fun showLoading() {}
    fun hideLoading() {}
    fun showError(errorViewModel: ErrorViewModel) {}
    fun hideError() {}
}