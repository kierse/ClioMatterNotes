package com.pissiphany.cliomatternotes.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kierse on 15-09-07.
 */
@Module
public final class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application app) {
        this.mApplication = app;
    }

    @Provides
//    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
