package com.ilhamsuaib.koin.home

import com.ilhamsuaib.koin.repo.Repository

/**
 * Created by @ilhamsuaib on 8/11/18.
 * github.com/ilhamsuaib
 */

class HomePresenter(val repo: Repository) {

    fun sayHello() = repo.giveHello()
}