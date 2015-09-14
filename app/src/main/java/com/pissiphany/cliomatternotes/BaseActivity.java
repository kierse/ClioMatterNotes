package com.pissiphany.cliomatternotes;

import android.support.v7.app.AppCompatActivity;

import com.pissiphany.cliomatternotes.di.component.ApplicationComponent;

/**
 * Created by kierse on 15-09-12.
 */
public class BaseActivity extends AppCompatActivity {
    protected ApplicationComponent getApplicationComponent() {
        return ((ClioApplication) getApplicationContext()).getComponent();
    }
}
