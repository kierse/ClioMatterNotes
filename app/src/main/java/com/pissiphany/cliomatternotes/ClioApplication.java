package com.pissiphany.cliomatternotes;

import android.app.Application;

import dagger.Component;

/**
 * Created by kierse on 15-09-07.
 */
public class ClioApplication extends Application {
    private ClioApplicationComponent mComponent;

    @Component(modules = {ApplicationModule.class})
    interface ClioApplicationComponent {
        ClioApplication injectApplication(ClioApplication app);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        this.mComponent = DaggerClioApplication_ClioApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mComponent.injectApplication(this);
    }

    ClioApplicationComponent getComponent() {
        return mComponent;
    }
}
