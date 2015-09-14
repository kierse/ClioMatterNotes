package com.pissiphany.cliomatternotes.di.component;

import com.pissiphany.cliomatternotes.MainActivity;
import com.pissiphany.cliomatternotes.annotation.PerActivity;
import com.pissiphany.cliomatternotes.di.module.MainActivityModule;

import dagger.Component;

/**
 * Created by kierse on 15-09-12.
 */
@PerActivity
@Component(
        dependencies = {ApplicationComponent.class},
        modules = {MainActivityModule.class}
)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
