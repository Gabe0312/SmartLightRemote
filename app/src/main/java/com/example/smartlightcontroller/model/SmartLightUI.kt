package com.example.smartlightcontroller.model

data class SmartLightUI (

    val id: String,
    val name: String,

    val room: String?,

    val isOn: Boolean,
    val brightness: Int,

    )