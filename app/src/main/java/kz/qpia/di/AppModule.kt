package kz.qpia.di

import kz.qpia.ui.screens.start.StartViewModel
import org.koin.dsl.module

val appModule = module {
    factory { StartViewModel() }
}