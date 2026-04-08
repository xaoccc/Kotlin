package com.example.mysecondapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ThirdAppReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "CUSTOM_ACTION") {
            Log.d("ReceiverTest", "Broadcast received!")
        }
    }
}