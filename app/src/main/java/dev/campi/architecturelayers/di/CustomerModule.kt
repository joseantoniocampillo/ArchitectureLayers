package dev.campi.architecturelayers.di

import dev.campi.architecturelayers.data.repository.CustomerDataRepository
import dev.campi.architecturelayers.data.repository.FakeDataSource
import dev.campi.architecturelayers.domain.repository.CustomerRepository
import dev.campi.architecturelayers.presentation.SimpleViewModel

// Esto es un ejemplo de lo que deberiamos hacer en un modulo de inyección de dependencias
object CustomerModule {

    private val customerRepository: CustomerRepository by lazy {
        CustomerDataRepository(FakeDataSource)
    }

    val simpleViewModelInjected by lazy {
        SimpleViewModel(customerRepository)
    }
}