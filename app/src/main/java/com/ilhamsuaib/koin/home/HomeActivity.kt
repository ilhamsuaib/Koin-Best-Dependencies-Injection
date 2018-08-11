package com.ilhamsuaib.koin.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ilhamsuaib.koin.R
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.android.ext.android.inject

class HomeActivity : AppCompatActivity() {

    //inject presenter
    private val presenter: HomePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tvHello.text = presenter.sayHello()
    }
}
