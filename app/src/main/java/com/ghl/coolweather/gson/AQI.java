package com.ghl.coolweather.gson;

/**
 * Created by admin on 2019/8/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
