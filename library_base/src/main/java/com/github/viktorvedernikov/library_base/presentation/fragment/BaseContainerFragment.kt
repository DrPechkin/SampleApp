package com.github.viktorvedernikov.library_base.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import timber.log.Timber

abstract class BaseContainerFragment : InjectionFragment() {

    @get:LayoutRes
    protected abstract val layoutResId: Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(layoutResId, null).also {
            Timber.v("onCreateView ${javaClass.simpleName}")
        }
}