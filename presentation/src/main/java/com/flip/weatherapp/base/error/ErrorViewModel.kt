package com.flip.weatherapp.base.error

interface ErrorViewModel {

    fun getMainErrorMessage() : String
    fun getButtonText() : String
    fun getButtonHandler() : ErrorViewActionDelegate

}