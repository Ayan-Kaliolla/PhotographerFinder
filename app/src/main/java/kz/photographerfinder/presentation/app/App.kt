package kz.photographerfinder.presentation.app

import android.app.Application
import kz.photographerfinder.data.DataSource
import kz.photographerfinder.data.DataSourceFireBase
import kz.photographerfinder.data.repository.PhotographerRepository
import kz.photographerfinder.presentation.home.HomeFragment
import kz.photographerfinder.presentation.home.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // declare used Android context
            androidContext(this@App)
            // declare modules
            modules(myModule)
        }
    }

    val myModule = module {

        scope(named<HomeFragment>()) {
            scoped { viewModel { HomeViewModel(get()) } }
        }

        single { PhotographerRepository(get()) }
        single<DataSource> { DataSourceFireBase() }
    }
}