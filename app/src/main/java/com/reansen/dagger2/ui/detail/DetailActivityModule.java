package com.reansen.dagger2.ui.detail;

import dagger.Module;
import dagger.Provides;

@Module
public class DetailActivityModule {

    @Provides
    DetailActivityViewModel provideDetailActivityViewModel() {
        return new DetailActivityViewModel();
    }


}
