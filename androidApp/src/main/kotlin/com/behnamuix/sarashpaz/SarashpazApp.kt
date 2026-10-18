package com.behnamuix.sarashpaz

import android.app.Application
import com.behnamuix.sarashpaz.core.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class SarashpazApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@SarashpazApp)
            modules(appModule)
        }
    }

}
