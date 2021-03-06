package com.pissiphany.matterexplorer.di.module;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pissiphany.matterexplorer.RxBus;
import com.pissiphany.matterexplorer.gson.AutoValueTypeAdapterFactory;
import com.pissiphany.matterexplorer.volley.NetworkEventHandler;

import javax.inject.Singleton;

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
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    RequestQueue provideRequestQueue(Application application) {
        return Volley.newRequestQueue(application);
    }

    @Provides
    @Singleton
    NetworkEventHandler providesNetworkEventHandler(RxBus bus) {
        return new NetworkEventHandler(bus);
    }

    @Provides
    @Singleton
    Gson providesGson() {
        return new GsonBuilder()
                .registerTypeAdapterFactory(new AutoValueTypeAdapterFactory())
                .create();
    }
}
