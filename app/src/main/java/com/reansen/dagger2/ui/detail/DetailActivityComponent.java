package com.reansen.dagger2.ui.detail;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {DetailActivityModule.class})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity> {
    }

}
