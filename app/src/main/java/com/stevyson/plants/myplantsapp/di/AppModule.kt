package com.stevyson.plants.myplantsapp.di

import com.stevyson.plants.myplantsapp.common.Constants
import com.stevyson.plants.myplantsapp.data.remote.PerenualApi
import com.stevyson.plants.myplantsapp.data.repository.PlantRepositoryImpl
import com.stevyson.plants.myplantsapp.domain.repository.PlantRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePerenualApi(): PerenualApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PerenualApi::class.java)
    }

    @Provides
    @Singleton
    fun providePlantRepository(api: PerenualApi): PlantRepository {
        return PlantRepositoryImpl(api)
    }
}