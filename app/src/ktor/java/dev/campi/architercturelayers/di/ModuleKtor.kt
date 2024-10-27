package dev.campi.architercturelayers.di

import dev.campi.architecturelayers.data.repository.CustomerDataKtorRepository
import dev.campi.architecturelayers.domain.repository.CustomerRepository
import org.koin.dsl.module


val customerRepoModule = module {
    single<CustomerRepository> { CustomerDataKtorRepository() }
}