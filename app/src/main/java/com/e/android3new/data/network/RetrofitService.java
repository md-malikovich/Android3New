package com.e.android3new.data.network;

import com.e.android3new.data.entity.ForecastWeatherEntity;
import com.e.android3new.data.entity.weather.CurrentWeatherEntity;

import java.net.URL;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface RetrofitService {

    @GET(ApiEndpoint.CURRENT_WEATHER) // = "weather"
    Call<CurrentWeatherEntity> getCurrentWeather(@Query("q") String city ,
                                                 @Query("appid") String appId,
                                                 @Query("units") String units);


//    baseurl/weather/bishkek/details&asasa=afnsnfnf
//    @GET("fibfifbi") // TODO: ignore @GET
//    Call<CurrentWeatherEntity> getWeather(Url String cityExamp, // link
//                                          @Query("q") String city , @Query("appid") String appId);

//baseurl/weather/bishkek/details&asasa=afnsnfnf //TODO: @Path
//    @GET(weather/{city}/details) // {city} = @Path("city") String cityExamp
//    Call<CurrentWeatherEntity> getWeather(@Path("city") String cityExamp,
//                                          @Query("q") String city , @Query("appid") String appId);

    @GET(ApiEndpoint.FORECAST_WEATHER)
    Call<ForecastWeatherEntity> getForecastWeather(@Query("q") String city ,
                                                   @Query("appid") String appId,
                                                   @Query("units") String units);
}

//https://api.openweathermap.org/data/2.5/
//https://samples.openweathermap.org/data/2.5/ // forecast // ?q=London,us&appid=b6907d289e10d714a6e88b30761fae22
