package com.e.android3new.data.entity.weather;

public class WindEntity {
    private String deg;

    private String speed;

    public String getDeg ()
    {
        return deg;
    }

    public void setDeg (String deg)
    {
        this.deg = deg;
    }

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [deg = "+deg+", speed = "+speed+"]";
    }
}


