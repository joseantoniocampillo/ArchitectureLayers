package dev.campi.architecturelayers

import android.app.Application
import dev.campi.architecturelayers.di.appModule
import dev.campi.architercturelayers.di.customerRepoModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(appModule, customerRepoModule)
        }
    }
}