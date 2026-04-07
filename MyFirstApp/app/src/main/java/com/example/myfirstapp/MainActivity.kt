package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = {
//                        Here we trigger the second activity by clicking the button
                        Intent(applicationContext, AnotherActivity::class.java).also {
                            startActivity(it)
                        }
                    }) {
                        Text(text = "Submit")
                    }
                    Button (onClick = {
                        Intent(Intent.ACTION_MAIN).also{
                            it.`package` = "com.google.android.youtube"
                            startActivity(it)
                        }
                    }) {
                        Text(text = "Open YouTube")
                    }
                    Button (onClick = {
                        Intent(Intent.ACTION_MAIN).also{
                            it.`package` = "com.google.android.gm"
                            startActivity(it)
                        }
                    }) {
                        Text(text = "Open Gmail")
                    }
                }


            }
        }
    }
}





