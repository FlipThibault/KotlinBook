package com.flip.data.entity.network

data class City(val id: Long,
                val name: String,
                val coord: Coordinate,
                val country: String,
                val population: Int)