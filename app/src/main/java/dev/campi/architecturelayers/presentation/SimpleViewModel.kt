package dev.campi.architecturelayers.presentation

// solo importamos de dominio, modelo e interface de repository
import dev.campi.architecturelayers.domain.Customer
import dev.campi.architecturelayers.domain.repository.CustomerRepository

class SimpleViewModel(
    private val customerRepository: CustomerRepository
) {
    fun getCustomer(id: Int): Customer = customerRepository.getCustomer(id)
}