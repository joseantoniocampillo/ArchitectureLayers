package dev.campi.architecturelayers.di

import dev.campi.architecturelayers.presentation.SimpleViewModel
import org.koin.dsl.module

val appModule = module {
    single { SimpleViewModel(get()) }
}