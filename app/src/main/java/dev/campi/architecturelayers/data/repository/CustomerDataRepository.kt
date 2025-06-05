package dev.campi.architecturelayers.data.repository

import dev.campi.architecturelayers.data.CustomerDTO
import dev.campi.architecturelayers.data.mappers.toCustomer
import dev.campi.architecturelayers.domain.Customer
import dev.campi.architecturelayers.domain.repository.CustomerRepository

class CustomerDataRepository(
    private val fakeDataSource: FakeDataSource
) : CustomerRepository {
    override fun getCustomer(id: Int): Customer {
        return fakeDataSource.getCustomerById(id).toCustomer()
    }
}

// FakeDataSource, podría ser acceso a una base de datos, a una API, a un archivo, etc.
object FakeDataSource {
    private val customers = listOf(
        CustomerDTO(
            1,
            "John Doe",
            "example@gmail.com",
            30,
            "Calle Falsa 123",
            "555-1234"
        ),
        CustomerDTO(
            2,
            "Jane Smith",
            "jane@example.com",
            25,
            "Fake Street 456",
            "555-5678"
        )
    )

    fun getCustomerById(id: Int): CustomerDTO =
        customers.firstOrNull { it.id == id } ?: customers.first()
}



