package com.pissiphany.cliomatternotes;

import android.app.Application;

import com.pissiphany.cliomatternotes.di.component.ApplicationComponent;
import com.pissiphany.cliomatternotes.di.component.DaggerApplicationComponent;
import com.pissiphany.cliomatternotes.di.module.ApplicationModule;
import com.pissiphany.cliomatternotes.di.module.NetworkModule;

/**
 * Created by kierse on 15-09-07.
 */
public class ClioApplication extends Application {
    private ApplicationComponent sComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        this.sComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    ApplicationComponent getComponent() {
        return sComponent;
    }
}
