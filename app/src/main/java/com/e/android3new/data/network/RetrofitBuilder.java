package com.e.android3new.data.network;

import com.e.android3new.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import static com.e.android3new.BuildConfig.WEATHER_BASE_URL;

public class RetrofitBuilder {

    public static RetrofitService instance;
    private static OkHttpClient client;

    public static RetrofitService getInstance(){
        if( instance == null)
            instance = buildRetrofit();
        return instance;
    }

    private static RetrofitService buildRetrofit() { //TODO: create Retrofit
        return new Retrofit.Builder()
                .baseUrl(WEATHER_BASE_URL) //TODO: ссылка, которая никогда не меняется
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build()
                .create(RetrofitService.class); //TODO: все то, что идет после baseUrl
    }

    private static OkHttpClient getClient(){
        if(client == null)
            client = okhttpBuilder();
        return client;
    }

    private static OkHttpClient okhttpBuilder(){
        return new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
    }
}
