package com.pissiphany.cliomatternotes.di.component;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.pissiphany.cliomatternotes.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kierse on 15-09-12.
 */
@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    Application application();
    RequestQueue requestQueue();
}
