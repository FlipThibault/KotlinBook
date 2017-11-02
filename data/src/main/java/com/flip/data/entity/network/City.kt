package com.flip.data.entity.network

/**
 * Created by pthibau1 on 2017-11-01.
 */
data class City(val id: Long,
                val name: String,
                val coord: Coordinate,
                val country: String,
                val population: Int)