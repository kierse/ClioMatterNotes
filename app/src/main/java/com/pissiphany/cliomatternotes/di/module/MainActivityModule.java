package com.pissiphany.cliomatternotes.di.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kierse on 15-09-12.
 */
@Module
public class MainActivityModule {
    @Provides
    @Named("random one")
    String provideRandomString1() {
        return "This is a random injected string! Foo!!";
    }

    @Provides
    @Named("random two")
    String provideRandomString2() {
        return "This is a another random injected string! Bar!!";
    }
}
