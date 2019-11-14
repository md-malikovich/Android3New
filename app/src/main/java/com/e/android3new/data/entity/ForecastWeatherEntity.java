package com.e.android3new.data.entity;

import com.e.android3new.data.entity.weather.CurrentWeatherEntity;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastWeatherEntity {

    private String cod;
    private Double message;

    @SerializedName(value = "cnt", alternate = "Cnt")
    private Integer cnt;

    private List<CurrentWeatherEntity> weatherList; //добавили поля из другой модельки

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public List<CurrentWeatherEntity> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<CurrentWeatherEntity> weatherList) {
        this.weatherList = weatherList;
    }
}
