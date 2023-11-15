package com.stevyson.plants.myplantsapp.data.repository

import com.stevyson.plants.myplantsapp.data.remote.PerenualApi
import com.stevyson.plants.myplantsapp.data.remote.dto.PlantDetailDto
import com.stevyson.plants.myplantsapp.data.remote.dto.PlantsDto
import com.stevyson.plants.myplantsapp.domain.model.Plant
import com.stevyson.plants.myplantsapp.domain.repository.PlantRepository
import retrofit2.Response
import javax.inject.Inject

class PlantRepositoryImpl @Inject constructor(
    private val api: PerenualApi
) : PlantRepository {
    override suspend fun getPlants(): PlantsDto {
        return api.getPlants()
    }

    override suspend fun getPlantById(plantId: Int): PlantDetailDto {
        return api.getPlantById(plantId)
    }

}