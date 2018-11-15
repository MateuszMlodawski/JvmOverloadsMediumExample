package com.mmlodawski.jvmoverloadsmediumexample.di

import android.content.Context
import com.mmlodawski.jvmoverloadsmediumexample.toolbox.Navigator
import org.koin.android.ext.koin.with
import org.koin.dsl.module.module
import org.koin.standalone.StandAloneContext.loadKoinModules

class KoinModules {
    companion object {
        @JvmStatic
        fun initKoin(context: Context) {
            val modules = listOf(mainModule)
            loadKoinModules(modules).with(context)
        }
    }
}

val mainModule = module {
    provideSingle { Navigator() }
}
