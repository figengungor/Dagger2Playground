package com.figengungor.dagger2playground;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by figengungor on 5/30/2017.
 */

@Module
public class AppModule {

    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    Context provideContext(){
        return context;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Singleton
    @Provides
    PreferencesHelper providePreferencesHelper(SharedPreferences sharedPreferences) {
        return new PreferencesHelper(sharedPreferences);
    }
}
