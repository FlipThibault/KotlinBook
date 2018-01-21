package com.flip.weatherapp.base

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<T>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bindData(data: T)
}