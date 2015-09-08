package com.pissiphany.cliomatternotes;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kierse on 15-09-07.
 */
@Module
final class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application app) {
        this.mApplication = app;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    RequestQueue provideRequestQueue() {
//        return new RequestQueue(null, new BasicNetwork(new HurlStack()));
        return Volley.newRequestQueue(mApplication);
    }
}
