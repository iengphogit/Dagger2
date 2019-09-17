package com.reansen.dagger2.ui.main;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class MainActivityViewModel extends ViewModel {

    public MainActivityViewModel() {
    }

    String getMe() {
        return "Hello from MainViewModel";
    }
}
