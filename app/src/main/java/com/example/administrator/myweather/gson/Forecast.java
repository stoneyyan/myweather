package com.example.administrator.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/5/3.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperaure temperaure;
    @SerializedName("cond")
    public More more;
    public class Temperaure{
        public String max;
        public String min;

    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
