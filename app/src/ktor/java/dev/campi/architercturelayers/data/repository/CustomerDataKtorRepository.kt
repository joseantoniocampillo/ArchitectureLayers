package dev.campi.architecturelayers.data.repository

import dev.campi.architecturelayers.data.CustomerDTO
import dev.campi.architecturelayers.data.mappers.toCustomer
import dev.campi.architecturelayers.domain.Customer
import dev.campi.architecturelayers.domain.repository.CustomerRepository

// import okhttp3.OkHttpClient ...
// Este recurso no está disponible para esta variant ya que se implementó a través de:
// "retrofitImplementation"(libs.retrofit)


class CustomerDataKtorRepository(
) : CustomerRepository {
    override fun getCustomer(id: Int): Customer {
        return CustomerDTO(
            1,
            "John Doe - Ktor",
            "example@gmail.com",
            30,
            "Calle Falsa 123",
            "555-1234"
        ).toCustomer()
    }
}



