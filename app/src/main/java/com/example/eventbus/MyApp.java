package com.example.eventbus;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

import java.util.Timer;
import java.util.TimerTask;

public class MyApp extends Application {
    Timer timer = new Timer();

    @Override
    public void onCreate() {
        super.onCreate();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                EventBus.getDefault().post(new MyEvent());
            }
        }, 2000, 2000);
    }
}
