package com.flip.data.entity.network.request

import android.util.Log
import com.flip.data.entity.network.response.ForecastResponse
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import java.net.MalformedURLException
import java.net.URL

class ForecastRequest(var zipCode: String? = "") {

    companion object {
        private val APP_ID = "95a59d67ee5dd9674245e4482956804c"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&appId=$APP_ID&q="
    }

    fun execute(): ForecastResponse? {
        return try {
            Log.d(javaClass.simpleName, COMPLETE_URL + zipCode)
            val jsonStr = URL(COMPLETE_URL + zipCode).readText() //don't use this on large responses
            Log.d(javaClass.simpleName, jsonStr)
            Gson().fromJson(jsonStr, ForecastResponse::class.java)
        } catch(e: MalformedURLException) {
            Log.d(javaClass.simpleName, e.message)
            null
        } catch(e: JsonSyntaxException) {
            Log.d(javaClass.simpleName, e.message)
            null
        }
    }

}