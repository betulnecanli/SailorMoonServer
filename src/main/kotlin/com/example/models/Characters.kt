package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Characters(
    val id: Int,
    val name: String,
    val image: String,
    val realName: String,
    val birthday: String,
    val age: Int?,
    val species: String,
    val heartRate : Double,
    val about : String
)
