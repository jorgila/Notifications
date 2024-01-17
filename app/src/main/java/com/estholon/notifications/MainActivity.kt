package com.estholon.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get data when the app is close or on resume

        val extras = intent.extras

        if(extras!=null){
            val example = extras.getString("example")
            Log.i("MainActivity","Para la clave example, el valor es $example")
        }

        // Llama al método `subscribeToTopic()` para suscribirte al tema.
        FirebaseMessaging.getInstance().subscribeToTopic("promos");

    }
}