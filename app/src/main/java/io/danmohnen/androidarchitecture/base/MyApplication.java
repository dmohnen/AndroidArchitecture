package io.danmohnen.androidarchitecture.base;

import android.app.Application;

public class MyApplication extends Application {

    ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
