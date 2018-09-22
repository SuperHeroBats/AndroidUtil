package com.androidutil.android.util;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    //全局的状态信息Application
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
