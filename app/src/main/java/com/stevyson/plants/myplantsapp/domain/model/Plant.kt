package com.stevyson.plants.myplantsapp.domain.model

import com.stevyson.plants.myplantsapp.data.remote.dto.DefaultImage

data class Plant(
    val common_name: String,
    val default_image: DefaultImage,
    val id: Int,
    val scientific_name: List<String>,
)

data class DefaultImage(
    val image_id: Int,
    val license: Int,
    val license_name: String,
    val license_url: String,
    val medium_url: String,
    val original_url: String,
    val regular_url: String,
    val small_url: String,
    val thumbnail: String
)
