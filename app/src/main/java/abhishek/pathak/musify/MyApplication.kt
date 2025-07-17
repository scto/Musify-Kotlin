package abhishek.pathak.musify

import abhishek.pathak.musify.di.appModule
import abhishek.pathak.musify.di.dataModule
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(appModule, dataModule)
        }
    }
}
