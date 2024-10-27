package dev.campi.architercturelayers.data.repository

import dev.campi.architecturelayers.data.CustomerDTO
import dev.campi.architecturelayers.data.mappers.toCustomer
import dev.campi.architecturelayers.domain.Customer
import dev.campi.architecturelayers.domain.repository.CustomerRepository

class CustomerRetrofitRepository(
) : CustomerRepository {
    override fun getCustomer(id: Int): Customer {
        return CustomerDTO(
            1,
            "John Doe - Retrofit",
            "example@gmail.com",
            30,
            "Calle Falsa 123",
            "555-1234"
        ).toCustomer()
    }
}



