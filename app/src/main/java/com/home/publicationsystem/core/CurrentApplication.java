package com.home.publicationsystem.core;

import android.app.Application;

import com.artlite.bslibrary.core.BSInstance;

/**
 * Class which provides application singletone
 */
public final class CurrentApplication extends Application {

    /** Method which provides the action when the application starts
     *
     */
    @Override
    public void onCreate() {
        super.onCreate();
        BSInstance.init(this);
    }
}
