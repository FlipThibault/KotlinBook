package com.flip.weatherapp.base

interface DataProvider<out T> {
    fun getData() : T
}