package com.e.android3new;

import android.app.Application;

import com.e.android3new.data.SharedPreferenceHelper;

public class App extends Application {

    private static SharedPreferenceHelper preferenceHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        preferenceHelper = new SharedPreferenceHelper(this);
    }

    public static SharedPreferenceHelper getPreference () {
        return preferenceHelper;
    }
}
