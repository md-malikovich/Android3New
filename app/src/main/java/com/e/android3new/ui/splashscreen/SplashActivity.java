package com.e.android3new.ui.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import com.e.android3new.App;
import com.e.android3new.R;
import com.e.android3new.ui.main.MainActivity;
import com.e.android3new.ui.onboard.OnBoardActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        activitySelectorWithTimer();
    }

    private void activitySelectorWithTimer() { //TODO: 2 sec for Splash
        int DELAY = 1000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                selectActivity();
            }
        }, DELAY);
    }

    private void selectActivity() {
        if(App.getPreference().getFirstLaunch()) {
            App.getPreference().setFirstLaunch();
            OnBoardActivity.start(this);
        } else {
            OnBoardActivity.start(this); //TODO: for test time
            //MainActivity.start(this);
        }
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}
