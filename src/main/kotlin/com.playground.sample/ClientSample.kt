package com.playground.sample

import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*

suspend fun main(){
    val client = HttpClient{
        install(JsonFeature)
    }
    val result: List<Film> = client.get {
        url("https://data.sfgov.org/resource/wwmu-gmzc.json")
    }
    println(result)
}

data class Film(
    val title: String,
    val director: String
)
