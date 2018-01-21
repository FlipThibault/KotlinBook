package com.flip.weatherapp.base.error

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.widget.Button
import android.widget.TextView
import com.flip.weatherapp.R

class ErrorView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {

    val primaryTextView: TextView
    val button: Button

    init {
        val root = inflate(getContext(), R.layout.error_view, null)

        primaryTextView = root.findViewById(R.id.error_view_text)
        button = root.findViewById(R.id.error_view_button)
    }

    fun apply(viewModel: ErrorViewModel) {
        primaryTextView.text = viewModel.getMainErrorMessage()
        button.text = viewModel.getButtonText()
        button.setOnClickListener {
            viewModel.getButtonHandler().onButtonClick()
        }
    }

}