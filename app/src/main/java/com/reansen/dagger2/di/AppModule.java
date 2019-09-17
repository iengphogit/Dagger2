package com.reansen.dagger2.di;

import android.app.Application;
import android.content.Context;

import com.reansen.dagger2.ui.detail.DetailActivityComponent;
import com.reansen.dagger2.ui.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {MainActivityComponent.class, DetailActivityComponent.class})
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }
}
