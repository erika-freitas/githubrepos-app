package com.ef.githubrepos.domain.di

import com.ef.githubrepos.domain.ListUserReposUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module {
        return module {
            factory { ListUserReposUseCase(get()) }
        }
    }
}