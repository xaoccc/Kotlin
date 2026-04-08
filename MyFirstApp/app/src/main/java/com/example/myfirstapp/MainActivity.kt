package com.example.myfirstapp

import android.R
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
import androidx.core.content.ContextCompat.startActivity

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
                        val intent = Intent(Intent.ACTION_SEND).apply{
                            type = "text/plain"
                            putExtra(Intent.EXTRA_EMAIL, arrayOf("xaocccc@gmail.com"))
                            putExtra(Intent.EXTRA_SUBJECT, arrayOf("Hello"))
                            putExtra(Intent.EXTRA_TEXT, arrayOf("Do you want to learn java?"))

                        }
                        if (intent.resolveActivity(packageManager) != null) {
                            startActivity(intent)
                        }
                    })
                    {
                        Text(text = "Send an email")
                    }
                }


            }
        }
    }
}





