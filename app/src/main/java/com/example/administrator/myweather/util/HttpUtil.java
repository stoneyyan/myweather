package com.example.administrator.myweather.util;

import javax.security.auth.callback.Callback;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/4/27.
 * 和服务器的交互
 */

public class HttpUtil  {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient  client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }


}
