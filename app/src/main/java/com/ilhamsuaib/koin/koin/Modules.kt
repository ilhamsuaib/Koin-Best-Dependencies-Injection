package com.ilhamsuaib.koin.koin

import com.ilhamsuaib.koin.home.HomePresenter
import com.ilhamsuaib.koin.repo.Repository
import com.ilhamsuaib.koin.repo.RepositoryImpl
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

/**
 * Created by @ilhamsuaib on 8/11/18.
 * github.com/ilhamsuaib
 */

val myModule: Module = applicationContext {
    factory { HomePresenter(get()) }
    bean { RepositoryImpl() as Repository }
}