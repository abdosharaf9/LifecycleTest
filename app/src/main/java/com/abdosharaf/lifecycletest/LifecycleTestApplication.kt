package com.abdosharaf.lifecycletest

import android.app.Application
import timber.log.Timber

class LifecycleTestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}