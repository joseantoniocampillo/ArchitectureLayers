package dev.campi.architecturelayers.data.mappers

import dev.campi.architecturelayers.data.CustomerDTO
import dev.campi.architecturelayers.domain.Customer

fun CustomerDTO.toCustomer() = Customer(
    id = id,
    name = name,
    email = email
)