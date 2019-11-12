package com.e.android3new.data;

import android.content.Context;
import android.content.SharedPreferences;
import static android.content.Context.MODE_PRIVATE;

public class SharedPreferenceHelper {

    private Context context;
    private SharedPreferences preferences;
    private final String PREFERENCE_NAME = "androidThree";
    private final String IS_FIRST_LAUNCH = "IS_FIRST_LAUNCH";

    public SharedPreferenceHelper(Context context) {
        this.context = context;
        createSharedPreference();
    }

    private void createSharedPreference() {
        preferences = context.getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);
    }

    public void setFirstLaunch() {
        preferences.edit().putBoolean(IS_FIRST_LAUNCH, false).apply();
    }

    public boolean getFirstLaunch() {
        return preferences.getBoolean(IS_FIRST_LAUNCH, true);
    }
}
