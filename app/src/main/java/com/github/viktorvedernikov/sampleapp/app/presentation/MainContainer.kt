package com.github.viktorvedernikov.sampleapp.app.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.github.viktorvedernikov.library_base.presentation.fragment.BaseContainerFragment
import com.github.viktorvedernikov.sampleapp.R
import com.github.viktorvedernikov.sampleapp.app.presentation.catalog.CategoriesFragment
import com.github.viktorvedernikov.sampleapp.app.presentation.home.HomeFragment
import com.github.viktorvedernikov.sampleapp.app.presentation.profile.ProfileFragment
import kotlinx.android.synthetic.main.main_container.*

class MainContainer : BaseContainerFragment() {

    private val screenAdapter by lazy {
        ScreenSlidePagerAdapter(requireFragmentManager())
    }

    override val layoutResId: Int = R.layout.main_container

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainScreenViewPager.adapter = screenAdapter
    }

    class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(
        fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
        override fun getItem(position: Int): Fragment = when (position) {
            0 -> CategoriesFragment()
            1 -> HomeFragment()
            2 -> ProfileFragment()
            else -> throw IllegalArgumentException("Error position not found")
        }

        override fun getCount(): Int = 3
    }
}