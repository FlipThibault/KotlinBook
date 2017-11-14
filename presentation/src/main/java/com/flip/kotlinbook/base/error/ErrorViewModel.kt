package com.flip.kotlinbook.base.error

/**
 * Created by pthibau1 on 2017-11-11.
 */
interface ErrorViewModel {

    fun getMainErrorMessage() : String
    fun getButtonText() : String
    fun getButtonHandler() : ErrorViewActionDelegate

}