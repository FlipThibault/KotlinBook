package com.flip.weatherapp.base.error

class ErrorViewModelImpl(val mainText: String, val buttonTxt: String, val actionHandler: ErrorViewActionDelegate) : ErrorViewModel {

    override fun getMainErrorMessage(): String {
        return mainText
    }

    override fun getButtonText(): String {
        return buttonTxt
    }

    override fun getButtonHandler(): ErrorViewActionDelegate {
        return actionHandler
    }
}