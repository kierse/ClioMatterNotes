package com.pissiphany.cliomatternotes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.RequestQueue;
import com.pissiphany.cliomatternotes.di.component.DaggerMainActivityComponent;
import com.pissiphany.cliomatternotes.di.component.MainActivityComponent;
import com.pissiphany.cliomatternotes.di.HasComponent;
import com.pissiphany.cliomatternotes.di.module.MainActivityModule;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends BaseActivity implements HasComponent<MainActivityComponent> {
    private MainActivityComponent mComponent;

    @Inject
    RequestQueue sQueue;

    @Inject
    @Named("random one")
    String mRandomString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mComponent = DaggerMainActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .mainActivityModule(new MainActivityModule())
                .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public MainActivityComponent getComponent() {
        return this.mComponent;
    }
}
