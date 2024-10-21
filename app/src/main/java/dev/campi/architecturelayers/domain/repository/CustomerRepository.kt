package dev.campi.architecturelayers.domain.repository

import dev.campi.architecturelayers.domain.Customer

interface CustomerRepository {

    fun getCustomer(id: Int): Customer
}