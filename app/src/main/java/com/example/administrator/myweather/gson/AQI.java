package com.example.administrator.myweather.gson;

/**
 * Created by Administrator on 2018/4/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
