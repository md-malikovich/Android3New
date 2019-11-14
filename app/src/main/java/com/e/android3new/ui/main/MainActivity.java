package com.e.android3new.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.e.android3new.R;
import com.e.android3new.data.entity.weather.CurrentWeatherEntity;
import com.e.android3new.data.network.RetrofitBuilder;
import com.e.android3new.ui.splashscreen.SplashActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.e.android3new.BuildConfig.WEATHER_KEY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitBuilder.getInstance().getCurrentWeather("Bishkek", WEATHER_KEY)
                .enqueue(new Callback<CurrentWeatherEntity>() {
                    @Override
                    public void onResponse(Call<CurrentWeatherEntity> call, Response<CurrentWeatherEntity> response) {
                        Log.d("asasdsd","bbbbb");
                        CurrentWeatherEntity data = response.body();
                        data.getWeather();
                        data.getMain().getTemp();
                    }

                    @Override
                    public void onFailure(Call<CurrentWeatherEntity> call, Throwable t) {
                        Log.d("asasdsd","bbbbbaaa");
                    }
                });
    }

//    private void initViewPager() {
//        ViewPager viewPager=findViewById(R.id.viewPagerPogoda);
//        viewPager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager(),0));
//    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
