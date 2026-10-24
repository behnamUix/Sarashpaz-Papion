package com.behnamuix.sarashpaz

import android.app.Application
import com.behnamuix.sarashpaz.core.di.initKoin
import org.koin.android.ext.koin.androidContext

class SarashpazApp: Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@SarashpazApp)
        }
    }
}
