package com.figengungor.dagger2playground;

import android.content.SharedPreferences;

/**
 * Created by figengungor on 5/30/2017.
 */

public class PreferencesHelper {

    public static String PREF_KEY_IS_FIRST_TIME = "isFirstTime";

    SharedPreferences sharedPreferences;

    public PreferencesHelper(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public boolean getIsFirstTime() {
        return sharedPreferences.getBoolean(PREF_KEY_IS_FIRST_TIME, true);
    }

    public void setIsFirstTime(boolean isFirstTime) {
        sharedPreferences.edit().putBoolean(PREF_KEY_IS_FIRST_TIME, isFirstTime).apply();
    }
}
