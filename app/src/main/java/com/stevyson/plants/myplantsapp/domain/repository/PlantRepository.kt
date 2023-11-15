package com.stevyson.plants.myplantsapp.domain.repository

import com.stevyson.plants.myplantsapp.data.remote.dto.PlantDetailDto
import com.stevyson.plants.myplantsapp.data.remote.dto.PlantsDto


interface PlantRepository {

    suspend fun getPlants(): PlantsDto

    suspend fun getPlantById(plantId: Int): PlantDetailDto

}