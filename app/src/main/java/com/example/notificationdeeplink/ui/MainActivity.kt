package com.example.notificationdeeplink.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.notificationdeeplink.R
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging


class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOne).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://ghozimahdi.com/one"))
            startActivity(i)
        }

        findViewById<Button>(R.id.btnTow).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://ghozimahdi.com/two"))
            startActivity(i)
        }

        findViewById<Button>(R.id.btnThree).setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://ghozimahdi.com/three"))
            startActivity(i)
        }

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w(TAG, "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            // Log and toast
            Log.d(TAG, token.toString())
            Toast.makeText(baseContext, token.toString(), Toast.LENGTH_SHORT).show()
        })
    }
}