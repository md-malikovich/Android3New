package com.e.android3new.ui.main;

import android.util.Log;

import androidx.fragment.app.Fragment;

import com.e.android3new.data.entity.weather.CurrentWeatherEntity;
import com.e.android3new.data.network.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.e.android3new.BuildConfig.WEATHER_KEY;

public class TestFragmemt extends Fragment {

    public void searchCity(String city){
        RetrofitBuilder.getInstance().getCurrentWeather(city, WEATHER_KEY, "metric")
                .enqueue(new Callback<CurrentWeatherEntity>() {
                    @Override
                    public void onResponse(Call<CurrentWeatherEntity> call, Response<CurrentWeatherEntity> response) {
                        Log.d("asdasdasd", "sdasdsdsdsd");
                        CurrentWeatherEntity data = response.body();
                    }

                    @Override
                    public void onFailure(Call<CurrentWeatherEntity> call, Throwable t) {
                        Log.d("asdasdasd", "sdasdsdsdsd");
                    }
                });
    }
}