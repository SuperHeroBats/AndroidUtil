package com.androidutil.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    //网络请求工具OkHttp
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
