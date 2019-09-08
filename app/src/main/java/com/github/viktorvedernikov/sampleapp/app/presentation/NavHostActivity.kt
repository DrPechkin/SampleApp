package com.github.viktorvedernikov.sampleapp.app.presentation

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.github.viktorvedernikov.library_base.presentation.activity.BaseActivity
import com.github.viktorvedernikov.sampleapp.R
import kotlinx.android.synthetic.main.activity_nav_host.*

class NavHostActivity : BaseActivity() {

    override val layoutResId = R.layout.activity_nav_host

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val navController = navHostFragment.findNavController()
        bottomNav.setupWithNavController(navController)
    }
}
