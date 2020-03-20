package com.example.backgreound_service;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
    IntentFilter filter = new IntentFilter("com.example.background_service");
    this.registerReceiver(new MyReceiver(), filter);
//    Intent intent = new Intent(this, RSSPullService.class);
//        startService(intent);
//    getApplicationContext().sendBroadcast(intent);
//        sendBroadcast();
  }
}

