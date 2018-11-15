package com.mmlodawski.jvmoverloadsmediumexample.di

import org.koin.dsl.context.ModuleDefinition
import org.koin.dsl.definition.Definition
import org.koin.dsl.definition.Kind

inline fun <reified T : Any> ModuleDefinition.provideSingle(
    noinline definition: Definition<T>) = provide(kind = Kind.Single, definition = definition)