package io.danmohnen.androidarchitecture.base;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import io.danmohnen.androidarchitecture.home.MainActivity;
import io.danmohnen.androidarchitecture.home.MainActivityComponent;

@Module(subcomponents =
        {MainActivityComponent.class,})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);

}
