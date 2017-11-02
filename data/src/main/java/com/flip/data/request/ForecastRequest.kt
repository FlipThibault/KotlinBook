package com.flip.data.request

import android.util.Log
import com.flip.data.response.ForecastResponse
import com.google.gson.Gson
import java.net.MalformedURLException
import java.net.URL

/**
 * Created by pthibau1 on 2017-11-01.
 */
class ForecastRequest(var zipCode: String? = "") {

    companion object {
        private val APP_ID = "95a59d67ee5dd9674245e4482956804c"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&appId=$APP_ID&q="
    }

    fun execute(): ForecastResponse {
        return try {
            val jsonStr = URL(COMPLETE_URL + zipCode).readText() //don't use this on large responses
            Log.d(javaClass.simpleName, jsonStr)
            Gson().fromJson(jsonStr, ForecastResponse::class.java)
        } catch( e: MalformedURLException) {
            Log.d(javaClass.simpleName, e.message)
            ForecastResponse()
        }

    }

}