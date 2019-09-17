package com.reansen.dagger2.ui.main;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    MainActivity provideMainActivity(MainActivity mainActivity) {
        return mainActivity;
    }

    @Provides
    MainActivityViewModel provideMainActivityViewModel(){
        return new MainActivityViewModel();
    }

}
