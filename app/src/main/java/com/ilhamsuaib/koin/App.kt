package com.ilhamsuaib.koin

import android.app.Application
import com.ilhamsuaib.koin.koin.myModule
import org.koin.android.ext.android.startKoin

/**
 * Created by @ilhamsuaib on 8/11/18.
 * github.com/ilhamsuaib
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin()
    }

    private fun startKoin() {
        //our modules
        val modules = listOf(myModule)

        //start koin
        startKoin(this, modules)
    }
}