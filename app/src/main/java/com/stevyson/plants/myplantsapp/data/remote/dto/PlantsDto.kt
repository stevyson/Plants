package com.stevyson.plants.myplantsapp.data.remote.dto

import com.stevyson.plants.myplantsapp.domain.model.Plant

data class PlantsDto(
    val common_name: String,
    val cycle: String,
    val default_image: DefaultImage,
    val id: Int,
    val other_name: List<String>,
    val scientific_name: List<String>,
    val sunlight: List<Any>,
    val watering: String
)

fun PlantsDto.toPlant(): Plant{
    return Plant(
        common_name = common_name,
        default_image = default_image,
        id = id,
        scientific_name = scientific_name
    )
}

