package com.example.esqueletoejercicioapi

import kotlinx.coroutines.delay

class DownloadManager {

    companion object {
        suspend fun downloadApiResults() : List<String> {
            // CONEXION A INTERNET
            // OKHTTP....
            delay(3000)
            return listOf("String 1", "String 2", "String 3", "String 4", "String 5", "String 6")
        }
    }
}