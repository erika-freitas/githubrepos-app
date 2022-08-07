package com.ef.githubrepos

import android.app.Application
import com.ef.githubrepos.data.di.DataModule
import com.ef.githubrepos.domain.di.DomainModule
import com.ef.githubrepos.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}