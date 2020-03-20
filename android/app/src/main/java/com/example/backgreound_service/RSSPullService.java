package com.example.backgreound_service;

import android.app.ActivityManager;
import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class RSSPullService extends IntentService {

    public RSSPullService() {
        super("shushant");
    }

    public RSSPullService(String name) {
        super(name);
    }


    protected void onHandleIntent(Intent workIntent) {
        try {
            String dataString = workIntent.getPackage();
            System.out.println("hello over here " + dataString);

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

//        try {
//            Thread.sleep(10000);
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("times up  heerre");
//        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
run();
        return super.onStartCommand(intent, flags, startId);
    }

    private void run() {
        while (true){
            System.out.println("MyService still running");
        }
    }

}
