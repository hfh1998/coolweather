package com.ghl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2019/8/25.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }



}
