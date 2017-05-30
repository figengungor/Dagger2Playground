package com.figengungor.dagger2playground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class WelcomeActivity extends AppCompatActivity {

    @Inject PreferencesHelper preferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ((MyApp)getApplication()).getAppComponent().inject(this);

        TextView message = (TextView) findViewById(R.id.message);

        if(preferencesHelper.getIsFirstTime()) {
            message.setText(getString(R.string.welcome_first_time_message));
            preferencesHelper.setIsFirstTime(false);
        }
        else{
            message.setText(getString(R.string.welcome_back_message));
        }

    }
}
