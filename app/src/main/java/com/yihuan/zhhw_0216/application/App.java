package com.yihuan.zhhw_0216.application;

import android.app.Application;

import com.aiton.administrator.shane_library.shane.utils.AppLog;

/**
 * Created by Administrator on 2017/2/16.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AppLog.DEBUG = true;
    }
}
