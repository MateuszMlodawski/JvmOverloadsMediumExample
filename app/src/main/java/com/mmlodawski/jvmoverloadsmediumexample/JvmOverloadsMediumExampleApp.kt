package com.mmlodawski.jvmoverloadsmediumexample

import android.app.Application
import com.mmlodawski.jvmoverloadsmediumexample.di.KoinModules


class JvmOverloadsMediumExampleApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        KoinModules.initKoin(this)
    }
}