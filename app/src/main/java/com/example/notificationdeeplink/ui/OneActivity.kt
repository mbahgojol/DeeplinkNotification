package com.example.notificationdeeplink.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLink
import com.example.notificationdeeplink.R

class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        if (intent.getBooleanExtra(DeepLink.IS_DEEP_LINK, false)) {
            val parameters = intent.extras
            val id = parameters?.getString("id")
            val name = parameters?.getString("name")
            val category = parameters?.getString("category")

            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        }
    }
}