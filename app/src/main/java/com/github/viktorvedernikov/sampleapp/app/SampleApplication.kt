package com.github.viktorvedernikov.sampleapp.app

import android.app.Application
import com.github.viktorvedernikov.sampleapp.BuildConfig
import com.github.viktorvedernikov.sampleapp.appModule
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import timber.log.Timber

class SampleApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(appModule)
    }

    override fun onCreate() {
        super.onCreate()

        initTimber()
        initStetho()
    }

    private fun initStetho() {

    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}