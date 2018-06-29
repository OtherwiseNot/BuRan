package com.shuiyu.buran;

import android.app.Application;
import android.content.Context;

/**
 * <pre>
 * author : buran
 * time   : 2018/06/26
 * </pre>
 */
public class InitApp extends Application {
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
