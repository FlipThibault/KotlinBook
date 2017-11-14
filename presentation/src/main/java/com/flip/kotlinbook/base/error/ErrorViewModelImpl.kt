package com.flip.kotlinbook.base.error

/**
 * Created by pthibau1 on 2017-11-11.
 */
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