package kz.qpia

import android.app.Application
import kz.qpia.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}