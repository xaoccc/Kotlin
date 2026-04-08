package com.example.mysecondapp

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mysecondapp.ui.theme.BroadcastTheme

class MainActivity : ComponentActivity() {

    private val airplaneModeReceiver = AirPlaneModeReceiver()
    private val testReceiver = ThirdAppReceiver()

    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        The receiver must be registered first
//        We use 2 parameters:
//        1. The receiver itself
//        2. The intent, using an intent filter
        registerReceiver(
            airplaneModeReceiver,
            IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        )
        registerReceiver(
            testReceiver,
            IntentFilter("CUSTOM_ACTION")
        )
        setContent {
            BroadcastTheme {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Button(onClick = {
                        Intent(applicationContext, SecondActivity::class.java).also{
                            startActivity(it)
                        }
                    }) {
                        Text (text = "Click me")
                    }

                    Button(onClick = {
                        Intent(Intent.ACTION_MAIN).also{
                            it.`package` = "com.google.android.youtube"
                            startActivity(it)
                        }
                    }) {
                        Text (text = "Open Youtube")
                    }
                    Button(onClick = {
                        Intent(Intent.ACTION_MAIN).also{
                            it.`package` = "com.google.android.apps.photos"
                            startActivity(it)
                        }
                    }) {
                        Text (text = "Open Photos")
                    }



                }
            }
        }
    }
//    The broadcast receiver must be unregistered when the activity is destroyed
    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(airplaneModeReceiver)
        unregisterReceiver(testReceiver)
    }
}




