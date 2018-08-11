package com.ilhamsuaib.koin.home

import android.arch.lifecycle.ViewModel
import com.ilhamsuaib.koin.repo.Repository

/**
 * Created by @ilhamsuaib on 8/11/18.
 * github.com/ilhamsuaib
 */

class HomeViewModel(private val repo: Repository): ViewModel() {

    fun sayHello() = repo.giveHello()
}