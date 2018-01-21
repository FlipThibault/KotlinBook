package com.flip.weatherapp.base

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import com.flip.weatherapp.R

class SimpleLoadingView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        inflate(context, R.layout.simple_loading_view, null)
    }

}