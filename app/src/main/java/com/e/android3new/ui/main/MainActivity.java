package com.e.android3new.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.e.android3new.R;
import com.e.android3new.ui.splashscreen.SplashActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
