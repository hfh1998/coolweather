package com.ghl.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2019/8/25.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
