package com.reansen.dagger2.di;

import android.app.Activity;

import com.reansen.dagger2.ui.detail.DetailActivity;
import com.reansen.dagger2.ui.detail.DetailActivityComponent;
import com.reansen.dagger2.ui.main.MainActivity;
import com.reansen.dagger2.ui.main.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);


    @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindDetailActivity(DetailActivityComponent.Builder builder);

}
