package com.wang.leaksdemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by WangChao on 2017/8/11.
 */

public class AppAplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
