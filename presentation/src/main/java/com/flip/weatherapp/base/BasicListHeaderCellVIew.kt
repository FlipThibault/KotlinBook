package com.flip.weatherapp.base

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.widget.TextView
import com.flip.weatherapp.R

class BasicListHeaderCellVIew(context: Context?, attrs: AttributeSet? = null, defStyle: Int = 0) : ConstraintLayout(context, attrs, defStyle) {

    val text : TextView?

    init {
        inflate(context, R.layout.basic_list_header_cell, this)

        text = findViewById(R.id.forcast_list_header_cell_text_view)
    }

}