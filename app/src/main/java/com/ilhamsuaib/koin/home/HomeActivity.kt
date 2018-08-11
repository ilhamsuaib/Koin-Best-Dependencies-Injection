package com.ilhamsuaib.koin.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ilhamsuaib.koin.R
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.android.architecture.ext.getViewModel
import org.koin.android.architecture.ext.viewModel
import org.koin.android.ext.android.inject

class HomeActivity : AppCompatActivity() {

    //inject home view model
    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvHello.text = homeViewModel.sayHello()
    }
}
