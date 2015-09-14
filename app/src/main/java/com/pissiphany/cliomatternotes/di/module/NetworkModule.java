package com.pissiphany.cliomatternotes.di.module;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kierse on 15-09-12.
 */
@Module
public class NetworkModule {
    @Provides
    @Singleton
    RequestQueue provideRequestQueue(Application application) {
        return Volley.newRequestQueue(application);
    }
}
