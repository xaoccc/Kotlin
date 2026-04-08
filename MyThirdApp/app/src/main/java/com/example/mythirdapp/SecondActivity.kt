package com.example.mythirdapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mythirdapp.ui.theme.MyThirdAppTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyThirdAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding -> Message(34, Modifier.padding(innerPadding) )
                }
            }
        }
    }
}

@Composable
fun Message(num: Int, modifier: Modifier = Modifier) {
    Text(
        text = "You have $num unread emails.",
        modifier = modifier
    )
}