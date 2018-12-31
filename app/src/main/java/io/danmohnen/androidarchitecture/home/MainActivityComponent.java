package io.danmohnen.androidarchitecture.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import io.danmohnen.androidarchitecture.di.ActivityScope;

@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{


    }

}
