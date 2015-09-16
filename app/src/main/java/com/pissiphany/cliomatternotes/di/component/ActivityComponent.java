package com.pissiphany.cliomatternotes.di.component;

import com.pissiphany.cliomatternotes.MainActivity;
import com.pissiphany.cliomatternotes.annotation.PerActivity;

import dagger.Component;

/**
 * Created by kierse on 15-09-12.
 */
@PerActivity
@Component(dependencies = {ApplicationComponent.class})
public interface ActivityComponent {
    void inject(MainActivity activity);
}
