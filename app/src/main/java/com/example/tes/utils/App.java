package com.example.tes.utils;

import android.app.Application;
import android.content.Context;


public class App extends Application {

    public static Context context = null;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
