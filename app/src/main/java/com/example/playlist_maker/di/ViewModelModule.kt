package com.example.playlist_maker.di

import MainViewModel
import com.example.playlist_maker.player.ui.view_model.PlayerViewModel
import com.example.playlist_maker.search.ui.view_model.SearchViewModel
import com.example.playlist_maker.settings.ui.view_model.SettingsViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        MainViewModel(themeInteractor = get())
    }

    viewModel {
        PlayerViewModel(playerInteractor = get())
    }

    viewModel {
        SearchViewModel(tracksInteractor = get(), searchHistoryInteractor = get())
    }

    viewModel {
        SettingsViewModel(themeInteractor = get())
    }

}