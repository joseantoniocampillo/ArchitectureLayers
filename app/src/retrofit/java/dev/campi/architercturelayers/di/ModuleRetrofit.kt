package dev.campi.architercturelayers.di

import dev.campi.architecturelayers.domain.repository.CustomerRepository
import dev.campi.architercturelayers.data.repository.CustomerRetrofitRepository
import org.koin.dsl.module

val customerRepoModule = module {
    single<CustomerRepository> { CustomerRetrofitRepository() }
}